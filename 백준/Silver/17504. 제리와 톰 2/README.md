# [Silver V] 제리와 톰 2 - 17504 

[문제 링크](https://www.acmicpc.net/problem/17504) 

### 성능 요약

메모리: 15960 KB, 시간: 148 ms

### 분류

구현, 수학

### 제출 일자

2025년 7월 20일 20:05:18

### 문제 설명

<p>톰은 마트에서 치즈 1kg 을 사서 집으로 돌아왔습니다.</p>

<p>그런데 톰이 한눈을 판 사이 제리가 와서 <mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"><mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mfrac><mjx-frac><mjx-num><mjx-nstrut></mjx-nstrut><mjx-mrow size="s"><mjx-mpadded><mjx-block style="margin: 0.86em 0px 0.3em;"><mjx-mrow></mjx-mrow></mjx-block></mjx-mpadded><mjx-mstyle style="font-size: 141.4%;"><mjx-texatom texclass="ORD"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-texatom></mjx-mstyle></mjx-mrow></mjx-num><mjx-dbox><mjx-dtable><mjx-line></mjx-line><mjx-row><mjx-den><mjx-dstrut></mjx-dstrut><mjx-mrow size="s"><mjx-mpadded><mjx-block style="margin: 0.86em 0px 0.3em;"><mjx-mrow></mjx-mrow></mjx-block></mjx-mpadded><mjx-mstyle style="font-size: 141.4%;"><mjx-texatom texclass="ORD"><mjx-msub><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D44E TEX-I"></mjx-c></mjx-mi><mjx-script style="vertical-align: -0.15em;"><mjx-mn class="mjx-n" size="s"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-script></mjx-msub><mjx-mo class="mjx-n" space="3"><mjx-c class="mjx-c2B"></mjx-c></mjx-mo><mjx-mfrac space="3"><mjx-frac><mjx-num><mjx-nstrut></mjx-nstrut><mjx-mrow size="s"><mjx-mpadded><mjx-block style="margin: 0.86em 0px 0.3em;"><mjx-mrow></mjx-mrow></mjx-block></mjx-mpadded><mjx-mstyle style="font-size: 141.4%;"><mjx-texatom texclass="ORD"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-texatom></mjx-mstyle></mjx-mrow></mjx-num><mjx-dbox><mjx-dtable><mjx-line></mjx-line><mjx-row><mjx-den><mjx-dstrut></mjx-dstrut><mjx-mrow size="s"><mjx-mpadded><mjx-block style="margin: 0.86em 0px 0.3em;"><mjx-mrow></mjx-mrow></mjx-block></mjx-mpadded><mjx-mstyle style="font-size: 141.4%;"><mjx-texatom texclass="ORD"><mjx-msub><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D44E TEX-I"></mjx-c></mjx-mi><mjx-script style="vertical-align: -0.15em;"><mjx-mn class="mjx-n" size="s"><mjx-c class="mjx-c32"></mjx-c></mjx-mn></mjx-script></mjx-msub><mjx-mo class="mjx-n" space="3"><mjx-c class="mjx-c2B"></mjx-c></mjx-mo><mjx-mfrac space="3"><mjx-frac><mjx-num><mjx-nstrut></mjx-nstrut><mjx-mrow size="s"><mjx-mpadded><mjx-block style="margin: 0.86em 0px 0.3em;"><mjx-mrow></mjx-mrow></mjx-block></mjx-mpadded><mjx-mstyle style="font-size: 141.4%;"><mjx-texatom texclass="ORD"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-texatom></mjx-mstyle></mjx-mrow></mjx-num><mjx-dbox><mjx-dtable><mjx-line></mjx-line><mjx-row><mjx-den><mjx-dstrut></mjx-dstrut><mjx-mrow size="s"><mjx-mpadded><mjx-block style="margin: 0.86em 0px 0.3em;"><mjx-mrow></mjx-mrow></mjx-block></mjx-mpadded><mjx-mstyle style="font-size: 141.4%;"><mjx-texatom texclass="ORD"><mjx-mo class="mjx-n"><mjx-c class="mjx-c22F1"></mjx-c></mjx-mo><mjx-mo class="mjx-n" space="3"><mjx-c class="mjx-c2B"></mjx-c></mjx-mo><mjx-mfrac space="3"><mjx-frac><mjx-num><mjx-nstrut></mjx-nstrut><mjx-mrow size="s"><mjx-mpadded><mjx-block style="margin: 0.86em 0px 0.3em;"><mjx-mrow></mjx-mrow></mjx-block></mjx-mpadded><mjx-mstyle style="font-size: 141.4%;"><mjx-texatom texclass="ORD"><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-texatom></mjx-mstyle></mjx-mrow></mjx-num><mjx-dbox><mjx-dtable><mjx-line></mjx-line><mjx-row><mjx-den><mjx-dstrut></mjx-dstrut><mjx-mrow size="s"><mjx-mpadded><mjx-block style="margin: 0.86em 0px 0.3em;"><mjx-mrow></mjx-mrow></mjx-block></mjx-mpadded><mjx-mstyle style="font-size: 141.4%;"><mjx-texatom texclass="ORD"><mjx-msub><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D44E TEX-I"></mjx-c></mjx-mi><mjx-script style="vertical-align: -0.15em;"><mjx-mi class="mjx-i" size="s"><mjx-c class="mjx-c1D441 TEX-I"></mjx-c></mjx-mi></mjx-script></mjx-msub></mjx-texatom></mjx-mstyle></mjx-mrow></mjx-den></mjx-row></mjx-dtable></mjx-dbox></mjx-frac></mjx-mfrac></mjx-texatom></mjx-mstyle></mjx-mrow></mjx-den></mjx-row></mjx-dtable></mjx-dbox></mjx-frac></mjx-mfrac></mjx-texatom></mjx-mstyle></mjx-mrow></mjx-den></mjx-row></mjx-dtable></mjx-dbox></mjx-frac></mjx-mfrac></mjx-texatom></mjx-mstyle></mjx-mrow></mjx-den></mjx-row></mjx-dtable></mjx-dbox></mjx-frac></mjx-mfrac></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mfrac><mrow><mpadded height="8.6pt" depth="3pt" width="0"><mrow></mrow></mpadded><mstyle displaystyle="false" scriptlevel="0"><mrow data-mjx-texclass="ORD"><mn>1</mn></mrow></mstyle></mrow><mrow><mpadded height="8.6pt" depth="3pt" width="0"><mrow></mrow></mpadded><mstyle displaystyle="false" scriptlevel="0"><mrow data-mjx-texclass="ORD"><msub><mi>a</mi><mn>1</mn></msub><mo>+</mo><mfrac><mrow><mpadded height="8.6pt" depth="3pt" width="0"><mrow></mrow></mpadded><mstyle displaystyle="false" scriptlevel="0"><mrow data-mjx-texclass="ORD"><mn>1</mn></mrow></mstyle></mrow><mrow><mpadded height="8.6pt" depth="3pt" width="0"><mrow></mrow></mpadded><mstyle displaystyle="false" scriptlevel="0"><mrow data-mjx-texclass="ORD"><msub><mi>a</mi><mn>2</mn></msub><mo>+</mo><mfrac><mrow><mpadded height="8.6pt" depth="3pt" width="0"><mrow></mrow></mpadded><mstyle displaystyle="false" scriptlevel="0"><mrow data-mjx-texclass="ORD"><mn>1</mn></mrow></mstyle></mrow><mrow><mpadded height="8.6pt" depth="3pt" width="0"><mrow></mrow></mpadded><mstyle displaystyle="false" scriptlevel="0"><mrow data-mjx-texclass="ORD"><mo>⋱</mo><mo>+</mo><mfrac><mrow><mpadded height="8.6pt" depth="3pt" width="0"><mrow></mrow></mpadded><mstyle displaystyle="false" scriptlevel="0"><mrow data-mjx-texclass="ORD"><mn>1</mn></mrow></mstyle></mrow><mrow><mpadded height="8.6pt" depth="3pt" width="0"><mrow></mrow></mpadded><mstyle displaystyle="false" scriptlevel="0"><mrow data-mjx-texclass="ORD"><msub><mi>a</mi><mi>N</mi></msub></mrow></mstyle></mrow></mfrac></mrow></mstyle></mrow></mfrac></mrow></mstyle></mrow></mfrac></mrow></mstyle></mrow></mfrac></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">$ \cfrac{1}{a_1 + \cfrac{1}{a_2 + \cfrac{1}{\ddots + \cfrac{1}{a_N}}}} $</span></mjx-container> kg 만큼 훔쳐갔습니다.</p>

<p>제리가 치즈를 훔쳐 간 후 톰이 가지고 있는 치즈의 무게는 얼마인가요?</p>

### 입력 

 <p>첫 번째 줄에 정수 <em>N</em> (2 ≤ <em>N</em> ≤ 15) 가 주어집니다.</p>

<p>두 번째 줄에는 정수 <em>a<sub>1</sub></em>, <em>a<sub>2</sub></em>, ..., <em>a<sub>N</sub></em> (1 ≤ <em>a<sub>i</sub></em> ≤ 9) 이 주어집니다.</p>

### 출력 

 <p>정답을 기약분수로 표현했을 때 <em>P</em>/<em>Q</em> kg 이라면 첫 번째 줄에 <em>P</em>와 <em>Q</em>를 공백을 사이에 두고 출력합니다.</p>

