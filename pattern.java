public class pattern 
{
    static void S(){
        clrscr();
        System.out.println("******************     ");
        System.out.println("******************     ");
        System.out.println("**                     ");
        System.out.println("**                     ");
        System.out.println("**                     ");
        System.out.println("**                     ");
        System.out.println("*****************      ");
        System.out.println("*****************      ");
        System.out.println("               **      ");
        System.out.println("               **      ");
        System.out.println("               **      ");
        System.out.println("               **      ");
        System.out.println("*****************      ");
        System.out.println("*****************      ");
    }
    static void H(){
        clrscr();
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("*****************      ");
        System.out.println("*****************      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
    }
    static void U(){
        clrscr();
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("*****************      ");
        System.out.println("*****************      ");
    }
    static void B(){
        clrscr();
        System.out.println("  **************       ");
        System.out.println(" *****************     ");
        System.out.println("**                **   ");
        System.out.println("**                **   ");
        System.out.println("**               **    ");
        System.out.println("****************       ");
        System.out.println("****************       ");
        System.out.println("**              **     ");
        System.out.println("**               **    ");
        System.out.println("**               **    ");
        System.out.println("**               **    ");
        System.out.println("**              **     ");
        System.out.println(" ***************       ");
        System.out.println("  *************        ");
    }
    static void H2(){
        clrscr();
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("*****************      ");
        System.out.println("*****************      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
    }
    static void A(){
        clrscr();
        System.out.println("*****************      ");
        System.out.println("*****************      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("*****************      ");
        System.out.println("*****************      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
        System.out.println("**             **      ");
    }
    static void M(){
        clrscr();
        System.out.println("****           *****      ");
        System.out.println("** ***        *** **      ");
        System.out.println("**  ***      ***  **      ");
        System.out.println("**   ***    ***   **      ");
        System.out.println("**    ***  ***    **      ");
        System.out.println("**     ****       **      ");
        System.out.println("**                **      ");
        System.out.println("**                **      ");
        System.out.println("**                **      ");
        System.out.println("**                **      ");
        System.out.println("**                **      ");
        System.out.println("**                **      ");
        System.out.println("**                **      ");
        System.out.println("**                **      ");
    }
    public static void main(String[] args) {
        S();H();U();B();H2();A();M();
    }

    static void clrscr()
    {
        try{
            Thread.sleep(1500);
        }
        catch(Exception shubham)
        {

        }
        System.out.println("\033[H\033[2J");
    }
}


/*Key Points :- 
    -\033 signals the start of an escape sequence.
    -[H is a control code that moves the cursor to the home position (top left corner).
    -[2J is another control code that instructs the terminal to clear the entire screen (ANSI escape code). 
*/