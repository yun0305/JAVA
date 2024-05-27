package ch14.multi_thread.Thread_Status.Yield;

/*
 * <다른 스레드에서 실행 양보>
 * 스레드가 처리하는 작업은 반복적인 실행을 위해 for문이나 while 문을 포함하는 경우가 많은데,
 * 가끔 반복문이 무의미한 반복을 하는 경우가 있다. 다음 코드를 보자. work의 값이 false라면
 * while 문은 어떠한 실행문도 실행하지 않고 무의미한 반복을 한다.
 * 
 * public void run(){
 * 
 * while(true){
 * 	if(work){
 * 		System.out.println("ThreadA 작업 내용");
 * 	}
 * }
 * 이때는 다른 스레드에게 실행을 양보하고 자신은 실행 대기 상태로 가는 것이 프로그램 성능에 도움이 된다.
 * 이런 기능을 위해 Thread는 yield()메소드를 제공한다. yield() 를 호출하면 스래드는 실행 대기 상태로
 * 돌아가고, 다른 스레드가 실행 상태가 된다.
 * 
 * 다음은 무의미한 반복을 하지 않고 다른 스레드에게 실행을 양보하도록 이전 코드를 수정한 것이다.
 * 
 * public void run(){
 * 
 * while(true){
 * 	if(work){
 * 		System.out.println("ThreadA 작업 내용");
 * 	
 *	}
 *	else{
 *		Thread.yield();	
 *}
 * }
 * 
 * 다음 예제에서는 처음 3초동안은 ThreadA와 ThreadB가 번갈아 가며 실행하다가 3초 뒤에 메인 스레드가 ThreadA의 work
 * 필드를 false로 변경함으로써 ThreadA가 yield() 메소드를 호출한다.
 * 따라서 ThreadB가 더 많은 실행 기회를 얻게 된다. 그리고 10초 뒤에 ThreadA의 work필드를 true로 변경해 ThreadA와 ThreadB가 다시 번갈아 가며 실행되도록 하자
 * 
 */

public class YieldExample {

}
