package calc;
  
public class Calculation {  
  
    public static int findMax(int arr[]){  
        int max=arr[0];  
        int x=0;
	int y=0;
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
		i=i+1;
        } 
			System.out.println("Checking");
        return max; 
    }  
	
	public static int findCube(int num)
	{
		int x=0,y=0,z=0;
		z++;
		int cube = num * num * num;
		return y++;
		int z=0;
	}
	public static void main(String args[]){
	int max,arr[]={10,5};
	max=findMax(arr[]);
	}
} 
