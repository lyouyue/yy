package com.ajia;

public class Test1 {

	public static void main(String[] args) {
		// �򻯵ľ�̬��ʼ����ֵ
		/*char c[] = { 'A', 'B', 'C' };
		
		//char  []data = new char[3];
		// ��̬��ʼ��
		char  []data = new char[]{'A', 'B', 'C' };
		// ������±��Ǵ��㿪ʼ
		data[0]='A';
		data[1]='B';
		data[2]='C';
		// ��������.length  ��ȡ����ĳ���
		for (int j = 0; j < data.length; j++) {
			System.out.println(data[j]);
		}*/
		
		// while 
		
		//whileMeth();
		//whileMeth1();
		//forMeth1();
	//	chengji();
		whilecj();
	}
   
	/**
	 * ����Ķ���
	 *  ��������   ��������[]=new  ��������[����ĳ���];
	 *   ��������   []��������=new  ��������[����ĳ���];
	 *  �ֲ�ʽ
	 *   ��������
	 *    ��������  ��������[] = null;
	 *   ��������ռ�
	 *     ��������=new ��������[];
	 * ��̬��ʼ��
	 *    ��������   []��������=new  ��������[]{ֵ,ֵ,...};
	 *  �򻯾�̬��ʼ��
	 *    ��������  []�������� ={ֵ,ֵ,ֵ,...};
	 *    
	 *    for(ѭ���ĳ�ʼ����;ѭ���Ľ�������;�ı�ѭ��������){
	 *       // ִ��ѭ�������
	 *    }
	 *    
	 *    while ѭ��
	 *    
	 *    ѭ���ĳ�ʼ����;
	 *    while(ѭ������������){
	 *       // ִ��ѭ�������
	 *       �ı�ѭ����������
	 *    }
	 *    
	 *    �����Ķ���
	 *    public static void ��������(��������  ���� ,��������  ���� ,...){
	 *      // ִ�з��������;
	 *    }
	 *    
	 *    88.8,56.4,98,60,96.0,56.2,12.6,77.7,88.9,66.5
	 *    56.2,12.6,77.7,88.9,66.5
	 *    ������ܳɼ���ƽ���ɼ�����߳ɼ�����С�ɼ� ��
	 *    �ֱ�д�������С�ɼ����±�
	 *    
	 *    
	 *    
	 */
	
	public static void whileMeth(){
		 char data[] ={ 'A', 'B', 'C' };
		 int i=0; //ѭ���ĳ�ʼ����
		 while(i<data.length){ // ����ѭ��������
			 System.out.println(data[i]);
			 i++; // �ı�ѭ��������
		 }
	}
	
	
	public static void whileMeth1(){
		 char data[] ={ 'A', 'B', 'C' };
		 int i=data.length-1; //ѭ���ĳ�ʼ����
		 while(i>=0){ // ����ѭ��������
			 System.out.println(data[i]);
			 i--; // �ı�ѭ��������
		 }
	}
	
	public static void forMeth1(){
		 char data[] ={ 'A', 'B', 'C' };
		  for(int i=data.length-1;i>=0;i--){
			  System.out.println(data[i]);
		  }
	}
	
	public  static void chengji(){
		// ����洢ѧ���ĳɼ�
		double data[]={88.8,56.4,98,60,96.0,56.2,12.6,77.7,88.9,66.5};
		double sum =0;//�������ܳɼ�
		double max = data[0]; // �������ɼ�
		int maxflag =0; // �������ɼ��±�
		int minflag=0; // ������С�ɼ��±�
		double  min =data[0]; //������С�ɼ�
		for(int i=0;i<data.length;i++){
			// sum+(-,/,*)=data[i] �ȼ��� sum=sum+(-,/,*)data[i];
			sum+=data[i];
			if(max<data[i]){ // �����ɼ�����
				max=data[i]; // ��ֵ�����ֵ
				maxflag=i; 
			}
			if(min>data[i]){ // ����С�ɼ���С
				min=data[i];
				minflag=i;
			}
		}
		System.out.println("�ܳɼ���"+sum);
		System.out.println("ƽ���ɼ���"+sum/data.length);
		System.out.println("���ɼ���"+max+"����λ���ǣ�"+maxflag);
		System.out.println("��С�ɼ���"+min+"����λ���ǣ�"+minflag);
	}
	
	public  static void whilecj(){
		// ����洢ѧ���ĳɼ�
		// �Ӵ�С������
		double data[]={88.8,56.4,98,60,96.0,56.2,12.6,77.7,88.9,66.5};
		double sum =0;//�������ܳɼ�
		double max = data[0]; // �������ɼ�
		int maxflag =0; // �������ɼ��±�
		int minflag=0; // ������С�ɼ��±�
		double  min =data[0]; //������С�ɼ�
		int i=0; // ѭ���ĳ�ʼ����
		while(i<data.length){ // ����ѭ��������
			// sum+(-,/,*)=data[i] �ȼ��� sum=sum+(-,/,*)data[i];
			sum+=data[i];
			if(max<data[i]){ // �����ɼ�����
				max=data[i]; // ��ֵ�����ֵ
				maxflag=i; 
			}
			if(min>data[i]){ // ����С�ɼ���С
				min=data[i];
				minflag=i;
			}
			i++; //�ı�ѭ��������
		}
		System.out.println("�ܳɼ���"+sum);
		System.out.println("ƽ���ɼ���"+sum/data.length);
		System.out.println("���ɼ���"+max+"����λ���ǣ�"+maxflag);
		System.out.println("��С�ɼ���"+min+"����λ���ǣ�"+minflag);
		
	}
}
