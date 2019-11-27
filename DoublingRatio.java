import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class DoublingRatio {

    public static double timeTrial(int N) {
        int MAX = 1000000;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }
        Stopwatch s = new Stopwatch();	//Stopwatch()生成计时器
        int cnt = ThreeSum.count(a);	//ThreeSum()统计文件中所有和为0的三整数元组的数量
        return s.elapsedTime();
    }


    public static void main(String[] args) { 
        double prev = timeTrial(125);
        for (int N = 250; true; N += N) {
            double time = timeTrial(N);		//timeTrial()生成随机整数
            StdOut.printf("%6d %7.1f %5.1f\n", N, time, time/prev);
            prev = time;
        } 
    } 
} 