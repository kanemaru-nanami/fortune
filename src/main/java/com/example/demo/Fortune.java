package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// リクエストを受け取るクラス
@Controller
public class Fortune {

	// 「/fortune」ときたら動くメソッドにしたい
	@RequestMapping("/fortune")
	public String start() {
		// 0.0～1.0の値をランダムに返す
		double fn =Math.random();

		// fnが0.7以上の値ならば
		if(fn >= 0.7) {
			return "greatFortune.html";
		// fnが0.4以上の値ならば
		}else if(fn >= 0.4) {
			return "middleFortune.html";
		// fnが0.1以上の値ならば
		}else if(fn>=0.1) {
			return "smallFortune.html";
		// それ以下（それ以外）
		}else {
			return "misFortune.html";
		}
	}

}
