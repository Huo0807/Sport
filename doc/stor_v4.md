# CodeByX 專案內容簡介 MD 標準規範

> 適用範圍：Java、Java Swing、Spring Boot、Python、Streamlit、HTML/CSS/JavaScript、AI Agent、n8n、資料庫、API 串接與其他教學／作品專案。

---

# 1. 專案名稱

建議同時包含：

- 中文名稱
- 英文名稱
- 專案類型

範例：

```text
中文名稱：門市每月銷售統計系統
英文名稱：Store Monthly Sales System
專案類型：Java Swing GUI Application
```

---

# 2. 專案簡介

簡短說明：

- 這個系統是做什麼的
- 解決什麼問題
- 使用者可以完成哪些操作
- 專案的實際應用場景

建議用 1～2 段即可讓讀者理解整個專案。

---

# 3. 學習目標

說明完成此專案後，可以學會哪些技術與觀念。

例如：

- Java 基礎語法
- 物件導向程式設計
- Array / Collection
- GUI 設計
- Event Handling
- Database
- REST API
- OpenAI API
- AI Agent
- 自動化流程

---

# 4. 開發環境

列出完整開發環境，例如：

```text
作業系統：Windows 11
IDE：Eclipse
GUI Designer：WindowBuilder
JDK：11
Database：MySQL 8
```

若為其他專案，也可加入：

- Python 版本
- Node.js 版本
- Spring Boot 版本
- Streamlit 版本
- Docker
- Git
- n8n
- OpenAI API
- 雲端平台

---

# 5. 使用技術

列出本專案使用的重要技術。

例如：

- Java
- Java Swing
- WindowBuilder
- OOP
- Array
- JDBC
- MySQL
- Spring Boot
- JPA
- HTML
- CSS
- JavaScript
- Python
- Pandas
- Streamlit
- RESTful API
- OpenAI API
- n8n

---

# 6. 核心功能

清楚列出系統能做什麼。

例如：

```text
- 輸入銷售資料
- 顯示每週銷售額
- 計算月銷售總額
- 計算各商品總銷售額
- 顯示統計結果
- 清除資料
```

---

# 7. 系統流程

建議使用流程圖式文字。

範例：

```text
啟動程式
   ↓
建立視窗
   ↓
載入預設資料
   ↓
使用者操作
   ↓
讀取輸入資料
   ↓
進行計算
   ↓
顯示結果
```

若為 AI Agent，可改為：

```text
使用者輸入問題
   ↓
Agent 分析需求
   ↓
選擇 Tool
   ↓
呼叫 API / Database / Workflow
   ↓
取得結果
   ↓
AI 整理回覆
```

---

# 8. 專案結構

列出主要資料夾與程式檔案。

範例：

```text
project/
│
├─ src/
│  ├─ Main.java
│  ├─ Product.java
│  └─ SalesFrame.java
│
├─ images/
│  └─ main.png
│
└─ README.md
```

並簡單說明每個檔案用途。

例如：

- `Main.java`：程式進入點
- `Product.java`：資料模型
- `SalesFrame.java`：GUI 與事件處理

---

# 9. Class 說明

Java 專案建議說明：

- Class 名稱
- Class 負責的工作
- Fields
- Constructors
- Methods

範例：

```text
Product
├─ productName
├─ price
├─ Product()
├─ Product(String name, int price)
├─ getProductName()
└─ getPrice()
```

---

# 10. Field 說明

說明重要變數的用途。

範例：

```java
private String productName;
private int price;
```

說明：

- `productName`：商品名稱
- `price`：商品價格

---

# 11. Constructor 說明

說明：

- 預設建構子
- 參數建構子
- 初始化物件資料的方式

範例：

```java
public Product(String productName, int price) {
    this.productName = productName;
    this.price = price;
}
```

重點：建立物件時，同時設定商品名稱與價格。

---

# 12. Method 說明

每個重要 Method 建議說明：

- 方法名稱
- 參數
- 回傳值
- 功能

範例：

```java
public int getTotalSales()
```

```text
功能：計算銷售總額
參數：無
回傳值：int
```

---

# 13. OOP 重點

Java 專案依實際使用情況說明：

- Class
- Object
- Encapsulation
- Constructor
- Getter / Setter
- `this`
- `static`
- Inheritance
- `extends`
- `super`
- Method Override
- Polymorphism
- Abstract Class
- Interface

沒有使用到的技術不需要硬寫。

---

# 14. Array / Collection 說明

若專案有使用資料結構，應說明：

- Array
- 二維 Array
- ArrayList
- List
- Set
- Map
- HashMap

例如：

```java
int[][] sales = new int[3][4];
```

說明：

```text
3 代表 3 種商品。
4 代表 4 週銷售資料。
```

---

# 15. GUI 元件

Swing / WindowBuilder 專案建議列出：

- JFrame
- JPanel
- JLabel
- JTextField
- JTextArea
- JButton
- JTable
- JComboBox
- JCheckBox
- JRadioButton
- JScrollPane

並說明各元件用途。

---

# 16. Event Handling

GUI 專案必須說明事件處理。

例如：

```java
btnCalculate.addActionListener(e -> {
    calculate();
});
```

流程：

```text
使用者按下按鈕
   ↓
ActionListener 接收事件
   ↓
執行指定 Method
   ↓
取得資料
   ↓
執行運算
   ↓
更新 GUI
```

---

# 17. 輸入資料

說明：

- 使用者需要輸入哪些資料
- 輸入格式
- 預設資料
- 限制條件

例如：

```text
商品名稱：String
商品價格：int
銷售數量：int
```

---

# 18. 計算邏輯

所有具有商業邏輯或公式的專案，都應列出公式。

範例：

```text
商品銷售額
= 商品單價 × 商品銷售數量
```

```text
每週總銷售額
= 商品 A 銷售額
+ 商品 B 銷售額
+ 商品 C 銷售額
```

```text
月總銷售額
= Week 1
+ Week 2
+ Week 3
+ Week 4
```

---

# 19. 輸出結果

說明程式最後會顯示哪些內容。

例如：

- 總銷售額
- 平均銷售額
- 最大值
- 最小值
- 商品排名
- 統計表
- 圖表
- AI 分析結果

---

# 20. 範例資料

建議放一組可以直接測試的資料。

例如：

```text
商品 A：100 元
商品 B：200 元
商品 C：300 元
```

---

# 21. 範例執行結果

提供正確執行結果，方便：

- 學生測試
- 教師驗證
- Debug
- 對照答案

---

# 22. 如何執行

說明如何將程式啟動。

例如 Eclipse：

```text
1. 開啟 Eclipse
2. 選擇 File
3. 選擇 Import
4. 選擇 Existing Projects into Workspace
5. 選擇專案資料夾
6. 確認 JDK 11
7. 執行 Main.java
```

---

# 23. 操作方式

說明程式啟動後如何使用。

例如：

```text
1. 輸入商品資料
2. 輸入銷售數量
3. 按下「計算」
4. 查看統計結果
5. 按下「清除」重新輸入
```

---

# 24. 執行畫面

建議加入畫面截圖。

Markdown：

```markdown
![主畫面](images/main.png)
```

可包含：

- 主畫面
- 資料輸入畫面
- 計算結果
- 錯誤訊息
- 報表畫面

---

# 25. 重要程式碼

不要把全部程式碼貼到 MD。

只挑：

- 核心演算法
- Array 處理
- Event
- Database
- API
- AI
- 計算功能

例如：

```java
for (int row = 0; row < sales.length; row++) {
    for (int col = 0; col < sales[row].length; col++) {
        total += sales[row][col];
    }
}
```

並補上程式說明。

---

# 26. 常見錯誤

Java：

- JDK 版本錯誤
- Package 不一致
- Class 找不到
- WindowBuilder 無法開啟
- `NullPointerException`
- `ArrayIndexOutOfBoundsException`
- `NumberFormatException`

Spring Boot：

- Port 被占用
- Database connection failed
- Bean 建立失敗
- API 404 / 500

Python：

- ModuleNotFoundError
- pip 套件未安裝
- Python 版本錯誤
- DataFrame 欄位錯誤

---

# 27. Debug 重點

建議列出 Debug 順序。

```text
1. 確認程式有沒有成功啟動
2. 確認輸入資料
3. 確認變數值
4. 確認 Array Index
5. 確認 Method 是否被呼叫
6. 確認 Event 是否觸發
7. 確認輸出結果
```

---

# 28. 練習題

每個教學專案可附延伸練習。

```text
Level 1
增加一種商品。

Level 2
增加第 5 週資料。

Level 3
找出最高銷售商品。

Level 4
增加 JTable 顯示。

Level 5
將資料儲存到 MySQL。
```

---

# 29. 進階延伸

建議把目前專案連接到下一階能力。

```text
Level 1：Console
        ↓
Level 2：Java Swing
        ↓
Level 3：MVC
        ↓
Level 4：MySQL
        ↓
Level 5：Spring Boot
        ↓
Level 6：Web Frontend
        ↓
Level 7：REST API
        ↓
Level 8：AI Analysis
```

---

# 30. 適合學習對象

例如：

- Java 初學者
- 已學 primitive type
- 已學 operator
- 已學 if
- 已學 loop
- 正在學 OOP
- 正在學 Array
- 正準備學 GUI

---

# 31. 先備知識

明確說明學習此專案前應具備的能力。

例如：

```text
- Java 基本語法
- primitive type
- operator
- if
- loop
- Class
- Object
- Method
```

---

# 32. 對應課程章節

建議呈現學習路線：

```text
Java 基礎
   ↓
if / loop
   ↓
Method
   ↓
Array
   ↓
OOP
   ↓
Swing
   ↓
Event Handling
   ↓
完整專案
```

---

# 33. 完成後應具備的能力

完成本專案後，學生應能：

- 建立 Java Class
- 建立 Object
- 使用 Constructor
- 使用 Getter / Setter
- 操作一維與二維 Array
- 使用 Swing 建立 GUI
- 建立 JButton Event
- 將資料與畫面連接
- 執行資料運算
- 將結果顯示在 GUI
- 執行基本 Debug

---

# 34. 版本資訊

建議每個正式專案都加入：

```text
Version：1.0
JDK：11
IDE：Eclipse
更新日期：2026-09
```

---

# 35. 作者 / 課程資訊

例如：

```text
Author：CodeByX
Course：Java Programming
Project Type：Teaching Project
```

---

# CodeByX 建議標準目錄

之後所有專案的 README / 內容簡介，可統一使用：

```text
# 專案名稱

## 1. 專案簡介
## 2. 學習目標
## 3. 開發環境
## 4. 使用技術
## 5. 核心功能
## 6. 系統流程
## 7. 專案結構
## 8. Class 說明
## 9. Field 說明
## 10. Constructor 說明
## 11. Method 說明
## 12. OOP 重點
## 13. Array / Collection
## 14. GUI 元件
## 15. Event Handling
## 16. 輸入資料
## 17. 計算邏輯
## 18. 輸出結果
## 19. 範例資料
## 20. 範例執行結果
## 21. 如何執行
## 22. 操作方式
## 23. 執行畫面
## 24. 重要程式碼
## 25. 常見錯誤
## 26. Debug 重點
## 27. 練習題
## 28. 進階延伸
## 29. 適合學習對象
## 30. 先備知識
## 31. 對應課程章節
## 32. 完成後能力
## 33. 版本資訊
## 34. 作者 / 課程資訊
```

---

# 撰寫原則

一份好的專案內容簡介，不應只描述「這個程式有什麼功能」，而應完整回答：

```text
這是什麼？
    ↓
為什麼做？
    ↓
用了什麼技術？
    ↓
程式如何運作？
    ↓
有哪些核心 Class / Method？
    ↓
輸入什麼？
    ↓
如何計算？
    ↓
輸出什麼？
    ↓
如何執行？
    ↓
如何操作？
    ↓
容易出錯在哪？
    ↓
學生學到了什麼？
    ↓
下一階可以如何升級？
```

---

# 最終目標

CodeByX 所有教學與作品專案，建議逐步統一為：

```text
程式原始碼
+
README / 內容簡介.md
+
操作說明
+
執行畫面
+
測試資料
+
練習題
+
進階延伸
```

如此可同時用於：

- 課堂教學
- 學生作品
- GitHub
- Google Drive
- 教材整理
- 專案展示
- 作品集
- 課程產品化
- 未來 AI Agent 自動產生教材
