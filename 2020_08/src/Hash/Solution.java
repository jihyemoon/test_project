package Hash;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
 
        //participant 배열에있는 각각의 값을 키로 한 {이름, 1} HashSet생성 
        
        Map<String, Integer> map = new HashMap<String, Integer>();
    
        //중복된 키값이 있을때마다 value에 1씩 더한다
        for(String name : participant) {
    		map.put(name, map.getOrDefault(name, 0)+1);	//해당 key값이 존재하면 key의 value를 반환하고 존재하지 않으면 기본값을 반환한다
    		
    	}
        
        System.out.println("이름|인원");
       
        for(String name : map.keySet()) {
    		System.out.println(" " + name + " | " + map.get(name));
    	}
		
		
        for(String name : map.keySet()){
        	for(String completor : completion) {
        		if(name.equals(completor)) {
        			map.put(name, map.get(name)-1);
        		}
        	}
        }
        
        System.out.println("====결과====");
        System.out.println("이름|인원");
        
        for(String name :  map.keySet()) {
        	if(map.get(name) != 0)
        		answer = name;
        	
    		System.out.println(" " + name + " | " + map.get(name));
    		
    	}
        
        System.out.println("미완주자 : " + answer);
    	return answer;
       
    }
	
}
