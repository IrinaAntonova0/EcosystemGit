public class MainBranch {
    static void main(String[] args) {
        System.out.println("MainBranch.main");
        printA();
        printB();
        System.out.println("Hamster in MainBranch.main");;
    }

    public static void printA(){
        System.out.println("MainBranch.printA");
    }

    public static void printB(){
        System.out.println("MainBranch.printB");
    }
}
