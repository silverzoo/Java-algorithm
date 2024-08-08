package ch09_tree;

import java.util.Comparator;

public class BinTree<K,V> {

    static class Node<K,V> {
        private K key;
        private V data;
        private Node<K,V> left;
        private Node<K,V> right;

        // 생성자
        Node(K key, V data, Node<K,V> left, Node<K,V> right) {
            this.key   = key;
            this.data  = data;
            this.left  = left;
            this.right = right;
        }

        // 키값을 반환
        K getKey() {
            return key;
        }

        // 데이터를 반환
        V getValue() {
            return data;
        }

        // 데이터를 표시
        void print() {
            System.out.println(data);
        }
    }

    private Node<K,V> root; //루트
    private Comparator<? super K> comparator = null; //비교자

    //a. 자연 순서에 따라 키값을 비교한다.
    public BinTree() {
        root = null;
    }

    //b. 비교자로 키값을 비교한다.
    public BinTree(Comparator<? super K> c) {
        this();
        comparator = c;
    }

    private int comp(K key1, K key2) {
        return (comparator == null) ? ((Comparable<K>)key1).compareTo(key2)
                : comparator.compare(key1, key2);
    }

    // 검색 메서드
    public V search(K key)    {
        Node<K,V> p = root;

        while (true) {
            //노드가 null이면 검색 실패
            if (p == null)
                return null;

            int cond = comp(key, p.getKey());
            // 키값이 일치하면 검색 성공
            if (cond == 0)
                return p.getValue();
                // key가 작으면 왼쪽 서브트리에서 검색
            else if (cond < 0)
                p = p.left;
                // key가 크면 오른쪽 서브트리에서 검색
            else
                p = p.right;
        }
    }

    // 삽입 메서드
    public void add(K key, V data) {
        if (root == null)
            root = new Node<K,V>(key, data, null, null);
        else
            addNode(root, key, data);
    }

    // node를 루트로 하는 서브트리에 Node<K,V> 삽입
    private void addNode(Node<K,V> node, K key, V data) {
        int cond = comp(key, node.getKey());

        // key가 이미 트리에 존재 -> 삽입x
        if (cond == 0)
            return;
            // key가 작으면 왼쪽 서브트리로 이동
        else if (cond < 0) {
            if (node.left == null)
                node.left = new Node<K,V>(key, data, null, null);
            else
                addNode(node.left, key, data);
            // key가 크면 오른쪽 서브트리로 이동
        } else {
            if (node.right == null)
                node.right = new Node<K,V>(key, data, null, null);
            else
                addNode(node.right, key, data);
        }
    }

    // 삭제 메서드
    public boolean remove(K key) {
        Node<K,V> p = root;                    // 스캔 중인 노드
        Node<K,V> parent = null;               // 스캔 중인 노드의 부모노드
        boolean isLeftChild = true;            // 탐색 방향을 기록하는 플래그

        while (true) {
            // a. 삭제할 노드 탐색 과정
            // null이면 삭제할 노드 존재x
            if (p == null)
                return false;

            int cond = comp(key, p.getKey());

            // 키값이 일치하면 검색 성공
            if (cond == 0)
                break;
            else {
                parent = p;
                // key가 작으면 왼쪽으로 이동
                if (cond < 0) {
                    isLeftChild = true;
                    p = p.left;
                    // key가 크면 오른쪽으로 이동
                } else {
                    isLeftChild = false;
                    p = p.right;
                }
            }
        }
        // b. 삭제 노드에 왼쪽 자식이 없는 경우
        if (p.left == null) {
            if (p == root)
                root = p.right;
            else if (isLeftChild)
                parent.left  = p.right;
            else
                parent.right = p.right;

            // c. 삭제 노드에 오른쪽 자식이 없는 경우
        } else if (p.right == null) {
            if (p == root)
                root = p.left;
            else if (isLeftChild)
                // 부모 왼쪽 포인터가 왼쪽 자식을 가리킴
                parent.left  = p.left;
            else
                parent.right = p.left;

            // d. 자식 노드가 2개인 경우
        } else {
            parent = p;
            // 왼쪽 서브트리 중 최대 노드 탐색
            Node<K,V> left = p.left;
            isLeftChild = true;

            // 최대 노드는 서브트리 내 가장 오른쪽에 위치함
            while (left.right != null) {
                parent = left;
                left = left.right;
                isLeftChild = false;
            }

            // 최대값 노드 값을 삭제할 노드에 복사
            p.key  = left.key;
            p.data = left.data;
            // 최대값 노드를 삭제할 노드의 자식으로 대체
            if (isLeftChild)
                parent.left  = left.left;
            else
                parent.right = left.left;
        }
        return true;
    }
}
