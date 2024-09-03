import sys
import heapq

INF = int(1e9)
n, m = map(int, input().split())

# graph[a]=[b,c] a부터 b까지 c시간이 걸림
graph = [[] for _ in range(n + 1)]
distance = [INF] * (n + 1)

for _ in range(m):
    # a=출발 b=도착 c=걸리는 시간
    a, b, c = map(int, sys.stdin.readline().split())
    graph[a].append([b, c])
    graph[b].append([a, c])


def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0
    while q:
        dist, node = heapq.heappop(q)
        if dist > distance[node]:
            continue
        for next in graph[node]:
            cost = dist + next[1]
            if cost < distance[next[0]]:
                distance[next[0]] = cost
                heapq.heappush(q, (cost, next[0]))
    return distance[n]


print(dijkstra(1))