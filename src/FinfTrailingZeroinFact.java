//https://www.youtube.com/watch?v=69jsFIMINpI&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=5
public class FinfTrailingZeroinFact {
    static void main() {
        int n = 30;  //30 fact
        int rs = 0;
        for (int i = 5; i<=n; i = i*5) {
            rs = rs + n/i;
        }
        System.out.println("Trailing Zero in Fact : "+rs);
    }
}
