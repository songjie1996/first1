package f;

import java.math.BigInteger;

public class first {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//建立一个for循环，用于打印第一个至第十个数字
				for(int i = 1;i <= 200;i++) {
					//调用函数进行打印
					System.out.print("第"+i+"个数是"+of(i) + "\n");
				}	
			}
	public static BigInteger of(int num) {
		//判断：是否是第一个数和第二个数
		BigInteger f,f1,f2;
		f1=new BigInteger("1");
		f2=new BigInteger("1");
		f=new BigInteger("1");

		int i;
		if(num==1)
		{
			
		}
		if(num==2)
			{
			
			}
		if(num>=3)
		{
		for(i=3;i<=num;i++)
		{
		f=f1.add(f2);
		f1=f2;
		f2=f;	
		}
		}
		return f;
	}

	}

