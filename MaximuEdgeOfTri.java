public class MaximuEdgeOfTri {
    //Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers
    //nextEdge(8, 10) ➞ 17
    //
    //nextEdge(5, 7) ➞ 11
    //
    //nextEdge(9, 2) ➞ 10
    //Notes
    //(side1 + side2) - 1 = maximum range of third edge.

    public int TriCal(int edge1, int edge2){

        int thirdEdge = (edge1 + edge2) -1;

        return thirdEdge;
    }

    public static void main(String[] args) {
        MaximuEdgeOfTri maximuEdgeOfTri = new MaximuEdgeOfTri();

        System.out.println("The maximum range of third edge is "+ maximuEdgeOfTri.TriCal(9, 2));
        System.out.println("The maximum range of third edge is "+ maximuEdgeOfTri.TriCal(8, 10));
        System.out.println("The maximum range of third edge is "+ maximuEdgeOfTri.TriCal(5, 7));
    }
}
