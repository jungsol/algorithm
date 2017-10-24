7장. 분할정복

* 분할 정복 알고리즘의 3가지 구성 요소
	1. divide :문제를 더 작은 문제로 분할
	2. merge : 각 묹에 대해 구한 답을 원래 문제에 대한 답으로 병합
	3. base case : 더이상 답을 분할하지 않고 곧장 풀 수 있는 매우 작은 문제

* 분할 정복 문제의 특성
	* 문제를 둘 이상의 부분문제로 나누는 자연스러운 방법이 있어야 하며,
	* 부분 문제의 답을 조합해 원래 문제의 답을 계산하는 효율적인 방법이 있어야 함
	
* 예제 <br/>
	1. 1부터 n까지의 합 구하기(SumOfNumbers) : solve(2017-10-05)
	2. 행렬의 거듭제곱
	3. 병합 정렬과 퀵 정렬
	4. 카라츠바의 빠른 곱셈 알고리즘
	5. 쿼드 트리 뒤집기(QUADTREE) : solve(2017-10-05)
	6. 울타리잘라내기 (FENCE) : solve(2017-10-06)
	7. 팬미팅 (FANMEETING)