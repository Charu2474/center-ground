import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner ch=new Scanner(System.in);
        int x=ch.nextInt();
        int y=ch.nextInt();
        int l=ch.nextInt();
        int xco=x+l/2;
        int yco=y+l/2;
        System.out.println("x-coordinate:"+x);
        System.out.println("y-coordinate:"+y);
        System.out.println("Length:"+l);
        System.out.println("Centre of the ground is at ("+xco+","+yco+")");
    }
}
