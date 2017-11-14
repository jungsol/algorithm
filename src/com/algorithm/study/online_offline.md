## 온라인 알고리즘과 오프라인 알고리즘

* 온라인 알고리즘
	* 전체 입력이 한꺼번에 주어지지 않아도 계산을 시작 할 수 있는 알고리즘
	* 알고리즘 수행 중 새 입력을 받아 계산을 계속 하기 떄문에, 입력 전체가 메모리에 올라와 있지 않아도 계산을 시작 할 수 있음
	* 예시
		* 삽입정렬 
			* 새 원소를이전의 정렬된 목록에 끼워넣는 방시긍로 동작하므로, 처음에 모든 원소가 없더라도 정렬을 시작 할 수 있음
	* 관련 문제
		* queue.ites : solve(2017-11-11)
	
* 오프라인 알고리즘
	* 입력 전체를 이미 가지고 있다고 가정하고 동작하는 알고리즘
	* 예시
		* 선택정렬
			* 남아 있는 모든 원소들 중에서 최소의 원소를 찾아서 맨 앞에 옮기는 방식으로, 모든 원소를 알고 있어야만 동작을 시작할 수 있음