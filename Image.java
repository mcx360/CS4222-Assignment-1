//Michal Kornacki
//ID:22361979
//group members:
//Karthik Santhosh Madhav ID:22350527
//Filip Kapusciak ID:22343091
//Oscar Zhou ID:22338705
//Stephen McNeill Killeen ID:22359206
import java.util.Arrays;
public class Image{
    private int[][] pixels;
    private int width;
    private int height;

    public Image(int[][] pixels){
        this.pixels = pixels;
        this.height = pixels.length;
        this.width = pixels[0].length;
    }

    //neatly represents the 2D Array so correcting is easier.
    public String toString(){
        String grid = Arrays.deepToString(pixels); 
        grid = grid.substring(1,grid.length()-1);
        grid = grid.replace("], ", "]\n");
        return grid; 
    }

    /*if boolean horizontal is true then the Image is flipped horizontaly and then
    made the default image using this.pixels operation, if horizontal is false then
    the the image is flipped vertically and made the default image using this.pixels operation.*/
    public void flip(boolean horizontal){
        if(horizontal == true){
            int[][]flippedHorizontaly = new int[pixels.length][pixels[0].length];
            int row=0;
            int col=0;
            int end=pixels[0].length-1;
            for(row=0;row<flippedHorizontaly.length;row++){
                end=pixels[0].length-1;
                for(col=0;col<flippedHorizontaly[0].length;col++){ 
                    flippedHorizontaly[row][col] = (int) (Math.random()*10);
                    flippedHorizontaly[row][col] = pixels[row][end];                    
                        end--;  
                }
            }
            this.pixels = flippedHorizontaly;            
        }  
        //Flips vertically
        else if(horizontal == false){
            int[][]flippedVerticaly = new int[pixels.length][pixels[0].length];
            int row=0;
            int col=0;
            int end=pixels.length;
            for(row=0;row<flippedVerticaly.length;row++){
                if(end !=0){
                    end--;}
                        for(col=0;col<flippedVerticaly[0].length;col++){
                            flippedVerticaly[row][col] = pixels[end][col];
                    }
            }
            this.pixels = flippedVerticaly;
        }
        }

        /*If the boolean clockwise is set to true then the method will turn the image
        90 degrees clockwise and then set it to the default image, this is done so the
        cumulative effects of flipping clockwise can be shown, if clockwise is set to false
        the image is rotated antiClockwise. This is done by rotating the image clockwise, and 
        then flipping it verticaly and horizontaly making it rotated antiClockwise*/
        public void rotate(boolean clockwise){
            if(clockwise == true){
                int[][] clockwiseRotation = new int[pixels[0].length][pixels.length];
                int row=0;
                int col=0;
                int end=pixels.length-1;
                int start = 0;
                for(row=0;row<clockwiseRotation.length;row++){
                    end=pixels.length-1;
                    for(col=0;col<clockwiseRotation[0].length;col++){
                        clockwiseRotation[row][col] = pixels[end][start];
                            if(end == 0){
                                start++;
                            }
                            else{
                                end--;
                            }
                    }
                }
                
            this.pixels = clockwiseRotation;
            }

            else if(clockwise == false){
                int[][] antiClockwiseRotation = new int[pixels[0].length][pixels.length];
                int row=0;
                int col=0;
                int end=pixels.length-1;
                int start = 0;
                for(row=0;row<antiClockwiseRotation.length;row++){
                    end=pixels.length-1;
                    for(col=0;col<antiClockwiseRotation[0].length;col++){
                        antiClockwiseRotation[row][col] = pixels[end][start];
                            if(end == 0){
                                start++;
                            }
                            else{
                                end--;
                            }
                    }
                } 
            this.pixels=antiClockwiseRotation;      
            flip(false);
            flip(true);
            
            }

        }
}
