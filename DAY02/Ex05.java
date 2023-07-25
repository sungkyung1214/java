class Ex05{
             public static void main(String[] args){
                         int kor = 90;
                         int eng = 80;
                         int math = 80;

                         //총점
                         //int sum = 90 + 80 + 80;
                         int sum = kor + eng + math;
                         
                         //평균
                         int avg = sum/3;  //소수점이 없음
                         
                         System.out.println(sum);
                         System.out.println(avg);

                         //소수점 가진 평균
                         double avg2 =sum/3; //소수점 이하 점수가 안나옴

                         System.out.println(avg2); //소수점 이하 점수가 안나옴


                         double avg3 =(double)(sum/3);
                         System.out.println(avg3);

                         double avg4 =(double)(sum)/3;
                         System.out.println(avg4);
                         
                         double avg5 =sum/3.0;
                         System.out.println(avg5);


                         //avg5 가지고 소수점2자리까지 구하기
                         double avg6 = (int)(avg5*100)/100.0 ; //8333/100.0
                         System.out.println(avg6);

                         //1472를 원단위 절삭해서 1470 으로 만들어 보자
                         int num1 =1472 ;
                         int num2 = (num1/10)*10 ;
                         System.out.println(num2);



}
}