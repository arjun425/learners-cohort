package com.ocp;

public class VariableDeclaration {

    public static void main(String[] args) {
        String _blue = "color";
        int blue$ = 3;
        int Blue = 20;
        int ￥ = 200;
        System.out.println(￥);
        System.out.println(_blue);
        System.out.println(blue$);
        System.out.println(Blue);

        int meal = 5;
        int tip = 2;
        int total = meal + (meal > 6 ? tip ++ : tip --);
        System.out.println(tip);
        System.out.println(total);

        float f = 4.0f;
        Float f1 = 4.0f;
        double q = 4.0f;
        Double q1 = 4.0d;
        Object q2 = 4.0f;

        System.out.println(f);
        System.out.println(f1);
        System.out.println(q);
        System.out.println(q1);
        System.out.println(q2);

        int sample = 1; double dou = 2.0d;

        float val = 10.0f;

        //extracted();
    }

    private static void extracted() {
        for (int i = 0;i<Character.MAX_VALUE;i++) {
            if(Character.isJavaIdentifierPart(i)) {
                System.out.println("i = "+ i + ": " + (char)i);
            }
        }
    }
}
