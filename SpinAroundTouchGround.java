public class SpinAroundTouchGround {
    //Spin Around, Touch the Ground
    //Given a list of directions to spin, "left" or "right", return an integer of how many full 360° rotations were made.
    // Note that each word in the array counts as a 90° rotation in that direction.
    //
    //Examples
    //spinAround(["right", "right", "right", "right", "left", "right"]) ➞ 1
    //# You spun right 4 times (90 * 4 = 360)
    //# You spun left once (360 - 90 = 270)
    //# But you spun right once more to make a full rotation (270 + 90 = 360)
    //
    //spinAround(["left", "right", "left", "right"]) ➞ 0
    //
    //spinAround(["right", "right", "right", "right", "right", "right", "right", "right"]) ➞ 2
    //
    //spinAround(["left", "left", "left", "left"]) ➞ 1

    public static int Spin(String[] turns){
        int revolve=0;

        for(int i=0; i< turns.length; i++){
            if(turns[i] == "right"){
                revolve += 90;
            } else {
                revolve -= 90;
            }
        }
        int fullRevolve = Math.abs(revolve/360);

        return  fullRevolve;

    }

    public static void main(String[] args) {
        String[] list1 =  {"right", "right", "right", "right", "right", "right", "right", "right"};

        System.out.println(Spin(list1));
    }

}
