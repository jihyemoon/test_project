package Hash;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public String solution(String[] participant, String[] completion) {
        String answer = "";
 
        //participant �迭���ִ� ������ ���� Ű�� �� {�̸�, 1} HashSet���� 
        
        Map<String, Integer> map = new HashMap<String, Integer>();
    
        //�ߺ��� Ű���� ���������� value�� 1�� ���Ѵ�
        for(String name : participant) {
    		map.put(name, map.getOrDefault(name, 0)+1);	//�ش� key���� �����ϸ� key�� value�� ��ȯ�ϰ� �������� ������ �⺻���� ��ȯ�Ѵ�
    		
    	}
        
        System.out.println("�̸�|�ο�");
       
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
        
        System.out.println("====���====");
        System.out.println("�̸�|�ο�");
        
        for(String name :  map.keySet()) {
        	if(map.get(name) != 0)
        		answer = name;
        	
    		System.out.println(" " + name + " | " + map.get(name));
    		
    	}
        
        System.out.println("�̿����� : " + answer);
    	return answer;
       
    }
	
}
