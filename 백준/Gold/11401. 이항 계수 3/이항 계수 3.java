import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    final static long P = 1000000007;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Long N = Long.parseLong(st.nextToken());
        Long K = Long.parseLong(st.nextToken());
        
        //분자 N!
        long numer = fac(N);
        
        //분모 (K!*(N-K)!)mod p
        long denom = fac(K)*fac(N-K)%P;
        
        //N! * 분모의 역원((K! * (N-K)!)
        bw.write(numer*pow(denom,P-2)%P+"");
        bw.flush();
        bw.close();
    }
    
    //팩토리얼
    static long fac(long N)
    {
        long fac = 1L;
        
        while(N>1)
        {
            fac = (fac*N)%P;
            N--;
        }
        return fac;
    }
    
    //역원
    //base: 밑, expo:지수
    static long pow(long base, long expo)
    {
        long result =1;
        
        while(expo>0)
        {
            //지수가 홀수면 반환하고자 하는 result에 곱해주도록 함
            //지수가 모두 짝수라면 expo가 1이 될때까지 base의 값이 제곱되다가 최종적으로 result에 담김
            if(expo%2==1)
            {
                result *=base;
                result %=P;
            }
            base = (base*base)%P;
            expo /=2;
        }
        return result;
    }
}
