package com.company;

class lopa {
    int k, j;

    void getdata(int p, int q) {
        k = p;
        j = q;
    }

    int sum() {
        return k + j;
    }

    int product() {
        return j * k;

    }

    int div() {
        return k / j;
    }

}

public class Q1 {
    public static void main(String args[]) {
        lopa a = new lopa();
        a.getdata(5, 9);
        System.out.println(a.sum());
        System.out.println(a.product());
    }
}