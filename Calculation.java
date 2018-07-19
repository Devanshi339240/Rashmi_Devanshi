package calc;
  
public class Calculation {  
  
    public static int findMax(int arr[]){  
        int max=arr[0];  
        int x=0;
	int y=0;
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
		x++;
        } 
			System.out.println("Checking");
        return max; 
    }  
	
	public static int findCube(int num)
	{
		int x=0,y=1;
		int cube = num * num * num;
		return y++;
	}
} 
