package com.rose.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.rose.vo.CircleInfoVO;
import com.rose.vo.FigureVO;
import com.rose.vo.RectInfoVO;
import com.rose.vo.TriangleInfoVO;

public class MenuBar {
	public static Scanner scan = new Scanner(System.in);
	static int inputone;
	static int inputtwo;
	//도형을 담을 Arraylist
	static List<CircleInfoVO> cirList = new ArrayList<CircleInfoVO>();
	static List<TriangleInfoVO> triList = new ArrayList<TriangleInfoVO>();
	static List<RectInfoVO> recList = new ArrayList<RectInfoVO>();
	//도형의 정보를 담을 vo
	static FigureVO figVO;
	static CircleInfoVO cirVO;
	static TriangleInfoVO triVO;
	static RectInfoVO recVO;
	
	//static초기화
	static{
		inputone=0;
		inputtwo=0;
	}
	
	//도형선택
	public static void figureSee() {
		System.out.println("========================");
		System.out.println("1.원형 2.삼각형 3.사각형 4.종료");
		System.out.println("선택: ");
		inputone = scan.nextInt();
	}
	//도형선택_상세 기능
	public static void figureKey() {
		switch (inputone) {
		case 1 : case 2 : case 3:
			functionSee();
			functionKey();
			break;
		case 4:
			System.out.println("종료하였습니다.");
			break;
		}
	}
	//기능 선택
	public static void functionSee(){
		System.out.println("=====================");
		System.out.println("1.입력 2.넓이조회 3.뒤로가기");
		System.out.println("선택: ");
		inputtwo = scan.nextInt();
	}
	//기능선택_상세 기능
	public static void functionKey(){
		try{
			switch(inputtwo){
			case 1:
				inputFigure();
				break;
			case 2:
				searchFigure();
				break;
			case 3:
				figureSee();
				figureKey();
				break;
			}
		}catch(InputMismatchException im){
			System.out.println("잘못입력하셨습니다.");
		}
	}
	//도형 입력
	public static void inputFigure(){
		try{
			if(inputone==1){
				cirVO=new CircleInfoVO();
				System.out.println("가로축을 입력하시오");
				double cirX=scan.nextDouble();
				System.out.println("세로축을 입력하시오");
				double cirY=scan.nextDouble();
				cirVO.setFigX(cirX);
				cirVO.setFigY(cirY);
				cirList.add(cirVO);
				functionSee();
				functionKey();
			}else if(inputone==2){
				triVO=new TriangleInfoVO();
				System.out.println("가로축을 입력하시오");
				double triX=scan.nextDouble();
				System.out.println("세로축을 입력하시오");
				double triY=scan.nextDouble();
				triVO.setFigX(triX);
				triVO.setFigY(triY);
				triList.add(triVO);
				functionSee();
				functionKey();
			}else{
				recVO=new RectInfoVO();
				System.out.println("가로축을 입력하시오");
				double recX=scan.nextDouble();
				System.out.println("세로축을 입력하시오");
				double recY=scan.nextDouble();
				recVO.setFigX(recX);
				recVO.setFigY(recY);
				recList.add(recVO);
				functionSee();
				functionKey();
			}
		}catch(InputMismatchException im){
			System.out.println("잘못입력하셨습니다.");
		}
	}
	//도형 넓이 조회
	public static void searchFigure(){
		try{
			switch(inputone){
			case 1:
				System.out.println("가로축을 입력하세요");
				double cirX=scan.nextDouble();
				System.out.println("세로축을 입력하세요");
				double cirY=scan.nextDouble();
				for(int i=0;i<cirList.size();i++){
					if(cirList.get(i).getFigX()==cirX){
						if(cirList.get(i).getFigY()==cirY){
							double result=cirX*cirY*3.14;
							System.out.println("원형의 넓이는 "+result+"입니다.");
						}else {
							System.out.println("저장된 도형이 아닙니다.");
						}
					}else{
						System.out.println("저장된 도형이 아닙니다.");
					}
				}
				break;
			case 2:
				System.out.println("가로축을 입력하시오");
				double triX=scan.nextDouble();
				System.out.println("세로축을 입력하시오");
				double triY=scan.nextDouble();
				for(int i=0;i<triList.size();i++){
					if(triList.get(i).getFigX()==triX){
						if(triList.get(i).getFigY()==triY){
							double result=triX*triY*0.5;
							System.out.println("삼각형의 넓이는"+result+"입니다.");
						}else {
							System.out.println("저장된 도형이 아닙니다.");
						}
					}else{
						System.out.println("저장된 도형이 아닙니다.");
					}
				}
				break;
			case 3:
				System.out.println("가로축을 입력하시오");
				double recX=scan.nextDouble();
				System.out.println("세로축을 입력하시오");
				double recY=scan.nextDouble();
				for(int i=0;i<recList.size();i++){
					if(recList.get(i).getFigX()==recX){
						if(recList.get(i).getFigY()==recY){
							double result=recX*recY;
							System.out.println("사각형의 넓이는 "+result+"입니다.");
						}else {
							System.out.println("저장된 도형이 아닙니다.");
						}
					}else{
						System.out.println("저장된 도형이 아닙니다.");
					}
				}
				break;
			}
		}catch(InputMismatchException im){
			System.out.println("잘못입력하셨습니다.");
		}
	}
}






























