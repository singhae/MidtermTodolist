
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalCount = getTotalCount();
		
		System.out.println("현재 전국에 코로나19 예방접종센터는 " + totalCount + "개 등록되어 있습니다. ");
		
		Covid19HospitalList hospitalInfo = getCovid19HospitalInfo(1,totalCount);
		
	}

}
