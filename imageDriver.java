//Michal Kornacki
//ID:22361979
//group members:
//Karthik Santhosh Madhav ID:22350527
//Filip Kapusciak ID:22343091
//Oscar Zhou ID:22338705
//Stephen Mc Neill Killeen ID:22359206

public class imageDriver{
    public static void main (String[] args){
        /*pixels array is passed to Image.java which is then given the 
         * properties of a 2d array, height, and a width,for testing purposes
         * the height and width is randomised to test if all different sizes work.
        */
        int[][] pixels = new int[(int)(Math.random()*10+3)][(int)(Math.random()*10+3)];
        for(int row=0;row<pixels.length;row++){  
            for(int col=0; col<pixels[0].length; col++){
               pixels[row][col] = (int) (Math.random()*10);
            }
        }
        /*Single object is used for all the operations in the Image.java,
         * so the method flip is tested using both booleans true and false,
         * while the rotate method is tested multiple times to ensure that
         * the array is able to be rotated multiple times.
         */
        Image original = new Image(pixels);
        

        //default array
        System.out.println("Default array:");
        System.out.println(original.toString());
        System.out.println();

        //horizontally flipped
        System.out.println("horizontaly flipped:");
        original.flip(true);
        System.out.println(original.toString());
        System.out.println();

        //Vertically flipped
        System.out.println("vertically flipped:");
        original.flip(false);
        System.out.println(original.toString());
        System.out.println();

        /*full clockwise rotation-prints the default array,then rotates clockwise
        until it returns to its starting position.*/
        System.out.println("full clockwise rotation:");
        System.out.println(original.toString());
        System.out.println();
        original.rotate(true);
        System.out.println(original.toString());
        System.out.println();
        original.rotate(true);
        System.out.println(original.toString());
        System.out.println();
        original.rotate(true);
        System.out.println(original.toString());
        System.out.println();
        original.rotate(true);
        System.out.println(original.toString());
        System.out.println();

        /*full antiClockwise rotation- prints the default array,then rotates antiClockwise
        until it returns to its starting position.
        */
        System.out.println("full antiClockwise rotation:");
        System.out.println(original.toString());
        System.out.println();
        original.rotate(false);
        System.out.println(original.toString());
        System.out.println();
        original.rotate(false);
        System.out.println(original.toString());
        System.out.println();
        original.rotate(false);
        System.out.println(original.toString());
        System.out.println();
        original.rotate(false);
        System.out.println(original.toString());
        System.out.println();         
        
    }

}



