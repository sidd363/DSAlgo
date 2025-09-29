
public class RemoveNthNode19 {
	int val;
	RemoveNthNode19 next;
	
	RemoveNthNode19(int val){
		this.val = val;
		next = null;
	}
	
	public static void  print(RemoveNthNode19 r) {
		while(r!=null) {
			System.out.println(r.val);
			r= r.next;
		}
	}
	
	
	public static RemoveNthNode19 remove (RemoveNthNode19 r, int n) {
		RemoveNthNode19 head = r;
		RemoveNthNode19 f = r;
		RemoveNthNode19 s = r;
		RemoveNthNode19 prev = r;
		while(n!=0) {
			System.out.println(r.val);
			f= f.next;
			n--;
		}
		 if(f==null){
	           return r.next;
	        }
	        
		while(f!=null) {
			f= f.next;
			prev =s;
			s= s.next;
		}
		
		prev.next = s.next;
		return head;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveNthNode19 r1 = new RemoveNthNode19(1);
		r1.next = new RemoveNthNode19(2);
		r1.next.next = new RemoveNthNode19(3);
		r1.next.next.next = new RemoveNthNode19(4);
		r1.next.next.next.next = new RemoveNthNode19(5);
		r1.next.next.next.next.next = new RemoveNthNode19(6);
		
		r1.next.next.next.next.next.next = new RemoveNthNode19(7);
		r1.next.next.next.next.next.next.next = new RemoveNthNode19(8);
		r1.next.next.next.next.next.next.next.next= new RemoveNthNode19(9);
		
		//r1.print(r1);
		RemoveNthNode19 head = r1; 
		print(remove(head, 3));
		
		
	}

}
