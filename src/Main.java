
public class Main {
    public static void main(String[] args){

        Points p1 = new Points(1,1);
        Points p2 = new Points(2,2);
        Points p3 = new Points(1,1);
        Points p4 = new Points(3,3);

        Line l1 = new Line(p1,p2);
        Line l2 = new Line(p3,p4);

        //double length1= Math.sqrt(Math.pow((p1.X-p2.X),2)+Math.pow((p1.Y-p2.Y),2));
        System.out.println("\n\nLength of line 1 is:"+l1.length);
        System.out.println("Length of line 1 is:"+l2.length);

        if(l1.length>l2.length){
            System.out.println("\nLength of 1st line is more than 2nd line");
        }
        else if(l1.length<l2.length){
            System.out.println("\nLength of 2nd line is more than 1st line");
        }
        else{
            System.out.println("\nBoth the lines are equal");
        }
    }


}