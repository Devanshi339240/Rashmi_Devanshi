package calc;
  
public class Calculation {  
  
    public static int findMax(int arr[]){  
        int max=arr[0];  
        int x=0;
	int y=0;
	x++;
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];
		max++;  
		i=i+1;
        } 
			System.out.println("Checking");
	System.out.println("Done");
        return max; 
    }  
	
	public static int findCube(int num,int z)
	{
		int x=0,y=0,z=0;
		z++;
		z++;
		int cube = num * num * num;
		return y++;
		int z=0;
		z++;
		System.out.println("Completed");
	}
} 
