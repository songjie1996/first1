package f;

import java.math.BigInteger;

public class first {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����һ��forѭ�������ڴ�ӡ��һ������ʮ������
				for(int i = 1;i <= 200;i++) {
					//���ú������д�ӡ
					System.out.print("��"+i+"������"+of(i) + "\n");
				}	
			}
	public static BigInteger of(int num) {
		//�жϣ��Ƿ��ǵ�һ�����͵ڶ�����
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

