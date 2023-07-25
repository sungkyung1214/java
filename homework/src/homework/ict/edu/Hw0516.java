package homework.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Hw0516 {


	    // 가위, 바위, 보 배열로 선언
	    private String[] gbbArr = new String[]{"가위", "바위", "보"};
	    

	    /**
	     * 컴퓨터 가위, 바위, 보 랜덤 지정
	     * @return
	     */
	    public String getComGbb(){
	        Random ran = new Random();
	        int idx = ran.nextInt(3); // 0, 1, 2

	        //System.out.println("idx :: " + idx);

	        return gbbArr[idx];
	    }


	    
	    /**
	     * 가위바위보 결과 리턴
	     * @param user
	     * @param com
	     * @return 사용자가 이기면 2, 비기면 1, 지면 0 
	     */
	    public int getWinner(String user, String com){
	        int res = 0;


	        switch(user){
	            case "가위" : 
	                if("가위".equals(com)){
	                    res = 1;
	                } else if("바위".equals(com)){
	                    res = 0;
	                } else {
	                    res = 2;
	                }
	                break;

	            case "바위" : 
	                if("가위".equals(com)){
	                    res = 2;
	                } else if("바위".equals(com)){
	                    res = 1;
	                } else {
	                    res = 0;
	                }
	                break;

	            case "보" : 
	                if("가위".equals(com)){
	                    res = 0;
	                } else if("바위".equals(com)){
	                    res = 2;
	                } else {
	                    res = 1;
	                }
	                break;
	        }

	        return res;
	    }

	        
	    



	}

