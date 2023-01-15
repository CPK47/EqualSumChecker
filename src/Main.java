public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test Data: ");
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));

    }

    public static class EqualSumChecker
    {
        public static boolean hasEqualSum(int iNumber1, int iNumber2, int iNumber3)
        {
            if ((iNumber1 + iNumber2) == iNumber3) return true;
            else return false;
        }
    }
}