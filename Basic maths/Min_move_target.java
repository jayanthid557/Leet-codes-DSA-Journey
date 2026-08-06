public class Min_move_target {
    public static void main(String[] args){
        //from target get to 1 ==> this is easier
        //this is based on confined 2 divisables we can also do without division constraint 
        int tar = 10;
        int doub = 4;
        int count = 0;
        
        if(tar < 1){
            System.out.println("Invalid number.");
        }
        
        while(tar > 1){
            if(doub == 0){
                count = (tar-1);
                break;
            }
            if(tar % 2 == 0 && doub > 0){
                tar = tar/2;
                count++;
                doub--;
            }
            else{
                tar--;
                count++;
            }
        }
        
        System.out.print(count);
    }
}
