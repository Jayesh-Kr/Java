

public class GetandSet {
    
    public static void getIthBit(int n, int i) {
        int BitMask = 1 << i;
        if((n & BitMask) == 0)
            System.out.println("0");
        else
            System.out.println("1");
    }

    public static void setIthBit(int n, int i) {
        int BitMask = 1 << i;
        System.out.println((n | BitMask));
    }

    public static void clearIthBit(int n, int i) {
        int BitMask = ~(1<<i);
        System.out.println((n & BitMask));
    }

    public static void updateIthBit(int n, int i, int newBit) {
        if(newBit == 0)
            clearIthBit(n, i);
        if(newBit == 1)
            setIthBit(n, i);

        // Second Method
        int no = clearIthBit(n, i);
        int BitMask = 1<<newBit;
        System.out.println((no | BitMask));        
    }

    public static void clearLastIthBit(int n, int i) {
        int BitMask = (~0)<<i;
        System.out.println((n & BitMask));
    }

    public static void clearRangeofBit(int n, int i, int j) {
        // 1010001110101100
        // 10100011 101011 00
        // i = 2
        // j = 7
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int BitMask = a | b;
        System.out.println((n & BitMask));
    }

    public static void powerOfTwo(int n) {
        if((n & (n-1)) == 0)
            System.out.println("Power of two");
        else    
            System.out.println("Not power of two");
    }

    public static void countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n&1) != 0)
                count++;
            n>>1;
        }
    }
    public static void main(String args[]) {
        getIthBit(5, 2);
        setIthBit(4, 0);
        clearIthBit(5, 0);
    }
}
