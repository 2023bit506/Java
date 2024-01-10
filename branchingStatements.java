//continue break return

public class branchingStatements {
    public static void printData() 
    {
        // for (int i = 1; i <= 100; i++) 
        // {
        //     // if(i==50)
        //     // {
        //     //     continue;
        //     // }
        //     // System.out.println(i);

        //     // if(i==51)
        //     // {
        //     //     break;
        //     // }
        //     // System.out.println(i);
        // }

        int j = 1;
        System.out.println(j);
        j++;
        if(j==2)
        {
            return;
        }

    }

    public static void main(String[] args) {
        printData();
    }
}


/*
 ----> break: Exits the closest loop or switch, immediately jumping to the next statement after it. Useful for controlling loop iterations or stopping switch evaluations.

 ----> return: Exits the current function, returning control to the calling code. Optionally returns a value to the caller for further use. Ideal for signifying function completion and sending results.

 ----> continue: Skips the remaining code in the current iteration of a loop and jumps back to the beginning of the next iteration. Handy for iterating through loops but conditionally skipping specific elements.
 */