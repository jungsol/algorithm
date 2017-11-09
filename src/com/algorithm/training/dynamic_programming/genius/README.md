## GENIUS

**Difficulty:** Medium

https://algospot.com/judge/problem/read/GENIUS

MP3 플레이어에 들어 있는 곡들을 전부 셔플 모드로 들을 때 최대의 문제점은 서로 어울리지 않는 노래들이 갑자기 나올 수 있다는 것입니다. <br/>
끈적한 애시드 재즈를 듣고 있다가 갑자기 시끄러운 데스 메탈이 나오는 것만큼 분위기를 깨는 것도 없지요. <br/>
때문에 전세계에서 가장 잘 나가는 MP3 플레이어를 생산하는 오렌지 사에서는 이번에 지니어스라는 기능을 출시했습니다. <br/>
지니어스는 MP3 플레이어에 들어 있는 곡들을 셔플 모드로 들을 때 잘 어울리는 것끼리 순서대로 재생되도록 해 줍니다. <br/>

태윤이는 오렌지 사의 새 MP3 플레이어를 산 뒤 재미로 지니어스의 동작 원리를 분석해 보았습니다. <br/>
지니어스를 사용하면 한 곡 다음에 다음 곡이 재생될 확률은 두 곡의 유사도에 따라 결정됩니다. <br/>
태윤이는 MP3 플레이어에 담긴 음악들 간의 유사도를 조사해, i 번 곡 다음에 j 번 곡이 재생될 확률을 나타내는 확률 행렬 T 를 만들었습니다. <br/>

태윤이는 방금 재생 버튼을 눌러 0번 곡을 듣기 시작했습니다. <br/>
K 분 30초가 지난 후 태윤이가 좋아하는 곡이 재생되고 있을 확률은 얼마일까요? <br/>
MP3 플레이어에 들어 있는 곡들의 길이는 모두 1분, 2분, 3분 혹은 4분입니다. <br/>

입력 <br/>
입력의 첫 줄에는 테스트 케이스의 수 C (1 <= C <= 50) 가 주어집니다. 각 테스트 케이스의 첫 줄에는 MP3 플레이어에 들어 있는 곡의 수 N (1 <= N <= 50 ) 과 K (1 <= K <= 1,000,000) , 그리고 태윤이가 좋아하는 곡의 수 M (1 <= M <= 10) 이 주어집니다. 그 다음 줄에는 N 개의 정수로 각 곡의 길이 Li 가 분 단위로 주어지고, 그 후 N 줄에는 한 곡이 재생된 후 다음 곡이 재생될 확률을 나타내는 행렬 T 가 주어집니다. T 의 i 번 줄의 j 번 숫자 (0 <= i,j < N) T[i,j] 는 i 번 곡이 끝난 뒤 j 번 곡을 재생할 확률을 나타냅니다. T 의 각 행의 합은 1 입니다. 각 테스트 케이스의 마지막 줄에는 M 개의 정수로 태윤이가 좋아하는 곡의 번호 Qi 가 주어집니다.

출력 <br/>
각 테스트 케이스마다 한 줄로 태윤이가 좋아하는 M 개의 곡에 대해 각 곡이 재생되고 있을 확률을 출력합니다. 10^-7 이하의 절대/상대 오차가 있는 답은 정답으로 인정됩니다.

```
Input:
3
3 6 3
4 4 2
0.18 0.40 0.42
0.15 0.46 0.39
0.58 0.23 0.19
0 1 2
4 10 4
1 3 2 4
0.26 0.07 0.49 0.18
0.21 0.33 0.15 0.31
0.41 0.20 0.38 0.01
0.28 0.31 0.18 0.23
2 0 3 1
4 1000 4
4 3 4 4
0.08 0.47 0.12 0.33
0.10 0.02 0.39 0.49
0.08 0.33 0.35 0.24
0.14 0.19 0.58 0.09
1 3 2 0 

Output: 
0.42360000 0.49660000 0.07980000 
0.31060929 0.13791635 0.26756048 0.28391388 
0.18648004 0.28409359 0.42243515 0.10699122 
```

**Note:**

**Show tag:** \#dynamic\_programming

------------------------------------

**Solution** <br/>
