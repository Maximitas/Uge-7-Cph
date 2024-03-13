package Task1;

//Task 1.a
public class Metoder {
    int counter = 0;

    //Task 1.c
    public void methodA(){
        System.out.println("J");
        for (int i = 0; i < 3; i++) {
            methodD();
        }
    }
    public void methodB(int number){
        switch (number){
            case 1:
                System.out.println("j");
                break;
            case 2:
                System.out.println("o");
                break;

        }
    }
    public void methodC(String msg){
            if(msg.length() > 7){
                System.out.println("r");
            } else {
                System.out.println("s");
            }
    }
    public void methodD(){
        counter++;
        if(counter == 1 || counter == 3){
            System.out.println("a");
        } else if(counter == 2 || counter == 5) {
            System.out.println("v");
        } else {
            System.out.println("e");
        }
    }
    public void methodE(){
        System.out.println("t");
    }
}
