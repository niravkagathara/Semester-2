public class SimpleInterest {
    public static void main(String[] args) {
        Interest i1 = new Interest(10, 10, 10);
        i1.calC();
    }
}

class Account_details {
    int p, r, n;
}

class Interest extends Account_details {
    Interest(int p, int r, int n) {
        this.p = p;
        this.r = r;
        this.n = n;
    }

    void calC() {
        int ans = (p * r * n) / 100;
        System.out.println("Total interest:" + ans);
    }
}
