package javaStudy.day3;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위, 바위, 보 또는 1, 2, 3 입력");
		
		
//		function resV(inputV, comV, result) {
//            let resM = "";
//            if (result === "win") {
//                resM = "축 승리!!";
//            } else if (result === "draw") {
//                resM = "무승부";
//            } else {
//                resM = "패배";
//            }
//
//            resM = `${resM} 컴 : ${comV}, 나 : ${inputV} 총 전적 ${total}전 ${win}승 ${draw}무 ${lose}패`
//            return resM;
//        }
//
//        let total = 0, win = 0, draw = 0, lose = 0;
//
//        function game() {
//            while (true) {
//                let inputV = prompt("가위, 바위, 보 중 하나를 입력하세요. 또는 가위 : 1, 바위 : 2, 보 : 3");
//                console.log(inputV);
//
//                if (inputV === null) {
//                    alert('게임 취소. 바이바이');
//                    break;
//                }
//
//                if (inputV === "") {
//                    alert("잘못된 입력입니다. 다시 입력하세요.");
//                    continue;
//                }
//
//                const com = ["가위", "바위", "보"];
//                const comInput = Math.round(Math.random() * (com.length - 1));
//                const comV = com[comInput];
//                total++;
//                let result = "";
//
//                if (inputV === comV) {
//                    draw++;
//                    result = "draw";
//                } else if ((inputV === "가위" && comV === "보") || (inputV === "바위" && comV === "가위") || (inputV === "보" && comV === "바위")) {
//                    win++;
//                    result = "win";
//                } else {
//                    lose++;
//                    result = "lose";
//                }
//
//                alert(resV(inputV, comV, result));
//
//                let isContinue = confirm('가위바위보 더 할래?');
//                if (!isContinue) {
//                    alert(`게임 종료. 총 전적 ${total}전 ${win}승 ${draw}무 ${lose}패`)
//                    break;
//                }
//            }
//        }
//
        System.exit(0);
		scanner.close();

	}

}
