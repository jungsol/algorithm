## NUMB3RS

**Difficulty:** Medium

https://algospot.com/judge/problem/read/NUMB3RS

위험한 살인마 두니발 박사가 감옥에서 탈출했습니다. <br/>
수배지를 붙이고 군경이 24시간 그를 추적하고 있지만 용의주도한 두니발 박사는 쉽사리 잡히지 않았습니다. <br/>
d일이 지난 후에야 경찰은 프로그래밍의 천재인 찰리 교수)를 찾아왔습니다. <br/>
찰리 교수는 두니발 박사가 감옥에 남겨둔 노트를 분석해 다음과 같은 가설을 세웠습니다. <br/>

* 두니발 박사는 검문을 피해 산길로만 이동한다.
* 두니발 박사는 교도소를 탈출한 당일, 교도소와 인접한 마을 하나로 도망쳐 은신한다.
* 두니발 박사는 수색을 피하기 위해 그 후 매일 인접한 마을로 움직여 은신한다.

(그림생략) <br/>

이 가설을 검증하기 위해 교도소로부터 산길로 연결된 n 개 마을들의 지도를 위 그림과 같이 구했습니다. <br/>
두니발 박사가 이 가설에 맞춰 행동하고, 움직일 수 있는 마을이 여러 개 있을 경우 그 중의 하나를 임의로 선택한다고 합시다. <br/>
d 일 후에 두니발 교수가 각 마을에 있을 확률을 계산하는 프로그램을 작성하세요. <br/>

예를 들어 위 지도에서 3번 마을에 교도소가 있다고 합시다. <br/>
탈옥 직후 두니발 교수는 0번, 1번, 2번, 4번, 5번 중의 한 도시를 임의로 골라 도망칩니다. <br/>
따라서 1일 후에 두니발 교수가 0번 마을에 숨어 있을 확률은 1/5이고, 2일 후에 1번 마을에 숨어 있을 확률은 1/15입니다

(그림생략) <br/>

예를 들어 그림 (a)는 정상적인 세로 단조 폴리오미노입니다. <br/>
그러나 (b)는 점선이 폴리오미노를 두 번 교차하기 때문에 세로 단조 폴리오미노가 아닙니다. <br/>
(c)는 맨 오른쪽 아래 있는 정사각형이 다른 정사각형과 변을 완전히 맞대고 있지 않기 때문에 폴리오미노가 아닙니다. <br/>

n개의 정사각형으로 구성된 세로 단조 폴리오미노의 개수를 세는 프로그램을 작성하세요. <br/>

입력 <br/>
입력의 첫 줄에는 테스트 케이스의 수 c (1 <= c <= 50) 가 주어집니다. 그 후 각 줄에 지도에 포함된 마을의 수 n (2 <= n <= 50) 과 탈출 후 지금까지 지난 일수 d (1 <= d <= 100), 그리고 교도소가 있는 마을의 번호 p (0 <= p < n) 가 주어집니다. 마을은 0번부터 n-1 번까지 순서대로 번호가 매겨져 있습니다. 그 후 n 줄에는 각각 n 개의 정수로 행렬 A 가 주어집니다. i 번 행의 j 번 숫자 A\[i\]\[j\] 가 1인 경우 i 번 마을에서 j 번 마을을 잇는 산길이 있다는 것을 의미하며, 0인 경우 길이 없다는 것을 의미합니다. 그 다음 줄에 확률을 계산할 마을의 수 t (1 <= t <= n) 가 주어지고, 그 다음 줄에 t 개의 정수로 확률을 계산할 마을의 번호 q (0 <= q < n) 가 주어집니다.

한 마을에서 다른 마을로 길이 있으면 반대 방향으로도 항상 있으며, 한 마을에서 자기 자신으로 연결되는 길은 없다고 가정해도 좋습니다.

출력 <br/>
각 테스트 케이스마다 t 개의 실수로 각 마을에 두니발 박사가 숨어 있을 확률을 출력합니다. 10-7 이하의 절대/상대 오차가 있는 경우 정답으로 처리됩니다.

```
Input:
2
5 2 0
0 1 1 1 0
1 0 0 0 1
1 0 0 0 0
1 0 0 0 0
0 1 0 0 0
3
0 2 4
8 2 3
0 1 1 1 0 0 0 0
1 0 0 1 0 0 0 0
1 0 0 1 0 0 0 0
1 1 1 0 1 1 0 0
0 0 0 1 0 0 1 1
0 0 0 1 0 0 0 1
0 0 0 0 1 0 0 0
0 0 0 0 1 1 0 0
4
3 1 2 6

Output: 
0.83333333 0.00000000 0.16666667
0.43333333 0.06666667 0.06666667 0.06666667
```

**Note:**

**Show tag:** \#dynamic\_programming

------------------------------------

**Main** <br/>
시간복잡도 : O(n^2) 공간복잡도 : O(n) <br/>
완전탐색으로 풀었다. <br/>
두니발박사는 day번 움직이는데, 매일매일 각각의 마을에 있을 확률을 배열에 저장하여 <br/>
day일 후에 각각의 마을에 있을 확률을 구하여서 반환한다.