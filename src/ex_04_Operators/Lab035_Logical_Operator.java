package ex_04_Operators;

public class Lab035_Logical_Operator
{
    public static void main(String[] args) {
        boolean married = false;
        System.out.println(married);
        System.out.println(!married);

        boolean hasCar = true;
        System.out.println(!!hasCar);

        boolean hasHouse = false || true;
        System.out.println(hasHouse);

        boolean hasBusiness = true && false;
        System.out.println(hasBusiness);
    }
}
