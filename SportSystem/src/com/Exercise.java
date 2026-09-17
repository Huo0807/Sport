package com;

public class Exercise {
	private String name;
	private String exerciseType;

	private int time;

	private double calorie;

	private static int exerciseCount = 0;

	public Exercise(String name, String exerciseType, int time) {
		super();
		this.name = name;
		this.exerciseType = exerciseType;
		this.time = time;

		calculateCalorie();
		getExerciseCount();
	}

	void calculateCalorie() {
		if (exerciseType.equals("跑步")) {
			calorie = time * 10;
		} else if (exerciseType.equals("騎腳踏車")) {
			calorie = time * 8;
		} else if (exerciseType.equals("游泳")) {
			calorie = time * 9;
		} else if (exerciseType.equals("健走")) {
			calorie = time * 5;
		}
	}

	void claculateexerciseCount() {
		exerciseCount++;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExerciseType() {
		return exerciseType;
	}

	public void setExerciseType(String exerciseType) {
		this.exerciseType = exerciseType;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public double getCalorie() {
		return calorie;
	}

	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

	public String getReport() {
		
		
		return "=============================\n" + 
		       "     健 身 運 動 報 告    \n" + 
		       "=============================\n" + 
		       " 姓名： " + name + "\n" + 
		       " 運動項目： " + exerciseType + "\n" + 
		       " 運動時間： " + time + " 分鐘\n" + 
		       " 預估消耗熱量： " + calorie + " 大卡\n" + 
		       "-----------------------------\n" + 
		       " 評價： " + getEvaluation() + "\n" + 
		       "=============================";
	}

		 String getEvaluation() {
				if (time >= 60) {
					return "非常棒！今天運動很充足！";
				} else if (time >= 30) {
					return "做得很好！繼續保持！";
				} else if (time > 0) {
					return "有運動就是很棒的開始！";
				} else {
					return "請輸入正確時間！";
				}
			}
	

	public static int getExerciseCount() {
		return exerciseCount;
	}

	public static void setExerciseCount(int exerciseCount) {
		Exercise.exerciseCount = exerciseCount;
	}

	public void show() {
		System.out.println(getReport());
	}

}
