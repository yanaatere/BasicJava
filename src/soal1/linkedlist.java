package soal1;

public class linkedlist {

    soal1.Node head;
    public void addToTheLast(soal1.Node node) {

        if (head == null) {
            head = node;
        } else {
            soal1.Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
        }
    }
    public static void main(String args[]) {

        int value;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            soal1.linkedlist llist = new soal1.linkedlist();
            int a1 = sc.nextInt();
            soal1.Node head = new soal1.Node(a1);
            llist.addToTheLast(head);

            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new soal1.Node(a));
            }
            soal1.Solution ob=new soal1.Solution();
            ob.display(llist.head);
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends
