public class SortDemo {
      static void sort01(int a[],int n) {
    	  int i=0,z=0,o=0,t=0;
    	  while(i<n) {
    		  if(a[i]==0) {
    			  z++;
    		  }
    		  if(a[i]==1) {
    			  o++;
    		  }
    		  if(a[i]==2) {
    			  t++;
    		  }
    		  i++;
    	  }
    	  i=0;
    	  while(z>0) {
//    		  System.out.println(z + ", " + i);
    		  a[i]=0;
    		  i++;
    		  z--;
    	  }
    	  while(o>0) {
    		  a[i]=1;
    		  i++;
    		  o--;
    	  }
    	  while(t>0) {
    		  a[i]=2;
    		  i++;
    		  t--;
    	  }

    	  for(i=0;i<n;i++) {
    		  System.out.println(a[i]);
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,2,1,1,2,0};
		sort01(arr,arr.length);
	}

}