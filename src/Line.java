public class Line {
    Points p1;
    Points p2;
    double length;
    Line(Points p1, Points p2){
        this.p1=p1;
        this.p2=p2;

        length = Math.sqrt(Math.pow((p1.X-p2.X),2)+Math.pow((p1.Y-p2.Y),2));


    }



}