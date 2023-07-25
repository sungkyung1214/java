class Ex04{
             public static void main(String[] args){
                         // 자료형 변환 : 프로모션과 디모션
                         //프로모션 : 작은자료형이 큰자료형으로 변환(저장)될때 문제없이 자동으로 변환(저장)됨  
                         //디모션   : 큰 자료형이 작은 자료형으로 변환 (저장)될때 오류 발생
                         //                오류가 발생되었을 때 강제로 자료형을 변경해서 오류를 방지하지만
                         //                정보 손실(원하는 정보가 아닌 정보)가 발생할 수 도 있다.

                         byte b1= 120;
                         int su1 = b1;
                         System.out.println(su1);

                         int su2 = 129;


                         //강제형 변환은 '= '기준으로 오른쪽자료형을 왼쪽자료형으로 만든다. 
                         // 왼쪽자료형 = (왼쪽자료형)오른쪽자료형((데이터));            
                         byte b2 = (byte)(su2);
                         System.out.println(b2);
                         
                         char c1 = 'K';
                         int su3 =c1 ;
                         System.out.println(su3);

                         
                         int su4 = 107;
                         char c2 = (char)(su4);
                         System.out.println(c2);

                         
                                                      

   }
}