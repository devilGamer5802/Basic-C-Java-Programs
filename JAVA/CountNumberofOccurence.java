
class CountNumberofOccurence
{
    static int frequencyDigits(int n,int d){
        int c = 0;
        while (n > 0){
		
		    if (n % 10 == d)
			c++;
		    n = n / 10;
        }
	    return c;
    }

    public static void main(String args[]){
        int n = 4564;
	    int d = 4;
	    System.out.println("No. of occurence:"+frequencyDigits(n, d));
    }
}
