# 研二完整学习路线（广州 / 深圳｜目标：大模型应用工程师 Java+AI 复合方向）
## 核心定位
主打 SpringBoot + SpringAI（Java） 做主线项目；Python 作为快速原型、脚本辅助；重心放在 RAG、Agent、LLM 工程落地。
避开深度学习训练、基座预训练等高门槛赛道；充分利用你的 Java 基础，形成差异化竞争力。
时间：2026.9（研二上）→ 2027.7（实习）→ 2027 秋招
每日可投入：3～4h；双线并行：Java 工程栈 + AI 大模型应用栈
重要原则：学到一个知识点立刻编码练习，杜绝只看视频；所有学习最终汇聚到 2 个简历项目
## 整体时间总览
第一阶段｜2026.09–2026.11（约 10 周）基础夯实：Java 补强 + Python 入门 + LLM 基础概念
第二阶段｜2026.12–2027.02（寒假，3 个月）核心技术栈 + 简历项目 1：RAG 私有知识库
第三阶段｜2027.03–2027.06（4 个月）Agent 进阶、工程化、实习投递、项目 2 迭代
第四阶段｜2027.07–2027.11（实习 + 秋招）面试八股、项目深挖、持续投递广深岗位
# 第一阶段：2026.09–2026.11｜基础夯实阶段
## 主线 A：Java 定向补强（每日 1～1.5h，配套之前的知识点清单 + 练习）
### 1）Java 基础核心（9.1–9.25）
面向对象：类、接口、抽象类、继承、多态、static/final、访问修饰符
✅练习：Document 文档类、DocumentParser 解析器多态设计
集合框架：ArrayList、HashMap、ConcurrentHashMap、遍历方式
✅练习：内存文档索引管理
Lambda + Stream 流（重点）
✅练习：批量文档过滤、数据转换
IO/NIO 基础 + Files 工具类、异常处理、自定义异常
✅练习：本地文件夹批量读取 txt 文件
基础多线程、ThreadPoolExecutor 线程池
✅练习：多线程并行读取文档
Jackson JSON 序列化 / 反序列化
✅练习：对象与 JSON 互相转换
### 2）SpringBoot 工程栈（9.26–11.15）
SpringBoot 项目搭建、yml 配置、IOC 注解体系
RESTful 接口开发：@Controller/@PostMapping/@GetMapping
分层架构：Controller → Service → 工具类
SSE/ResponseBodyEmitter 流式输出（AI 岗位重中之重）
MyBatis-Plus、MySQL 基础 CRUD
✅产出简易 Demo：文档基础管理后台（文档新增、列表查询）
❗重要提醒：不用等 Java 全部学完再碰 AI，同步开启 Python 与 LLM 学习
## 主线 B：Python 入门（每日 1h，够用即可，不追求精通）
目标：能写脚本、跑 LangChain 原型、调试开源项目
Python 基础语法：变量、循环、条件、函数、类
文件操作、json、异常处理
第三方包安装 pip、虚拟环境
asyncio 异步基础
FastAPI 基础，简单接口开发
✅练习：用 FastAPI 写一个简易对话接口
## 主线 C：LLM 基础理论 & 环境搭建（每日 0.5～1h）
只学应用层，跳过 Transformer 数学推导
核心概念：Token、上下文窗口、流式输出、Function Calling、Prompt、幻觉
主流模型认知：Qwen、Llama3、DeepSeek
Ollama 安装，本地部署开源大模型（关键！摆脱依赖云端 API）
学会调用 Ollama http 接口
## 阶段最终验收标准
Java：可以独立使用 SpringBoot 写接口、实现 SSE 流式返回
Python：能独立运行 FastAPI + 调用 Ollama
可以分别用 Java、Python 写出最简单的本地大模型对话 Demo
# 第二阶段：2026.12–2027.02｜寒假冲刺：核心技术栈 + 简历项目 1
## 主线 A：Java 侧进阶
SpringAI 完整学习（你的核心差异化）
调用 Ollama、Prompt 模板、聊天记忆
LangChain4j 了解（备选框架）
## 主线 B：AI 核心技术 ——RAG（求职最高频考点）
两套方案都实践：
Python 原型：LangChain + LlamaIndex 快速验证思路
Java 工程实现：SpringAI + PGVector/Milvus（放到简历项目）
### 学习内容：
RAG 完整链路：文档加载 → 文本切分 → Embedding → 向量库存储 → 检索召回 → LLM 生成
向量数据库：PGVector（简单易上手）、Milvus 基础使用
切片策略、召回优化、重排序、幻觉抑制方案
✅ 简历项目 1：基于 SpringBoot+SpringAI 的私有知识库问答系统
### 功能清单：
上传 TXT/PDF 文档入库
文档切片、向量化存入向量库
用户提问，检索相关文档片段，RAG 增强问答
SSE 流式输出答案
Docker 打包部署
## 主线 C：配套工程能力
Linux 基础命令（文件、进程、端口）
Docker 基础，编写 Dockerfile 打包 Java 项目
不用深入 K8s，先掌握单机部署
# 第三阶段：2027.03–2027.06｜Agent 进阶 + 准备实习投递
主线 A：Agent 智能体开发（行业下一个热点）
Function Calling 原理、ReAct 框架思想
Python：LangGraph 做 Agent 原型
Java 调研 SpringAI Agent 能力
✅练习：搭建具备工具调用的智能助手（查询文件、计算、联网检索）
主线 B：拓展知识（面试加分项）
微调基础认知：LoRA、QLoRA，明白适用场景（不用自己训练大模型）
推理基础概念：vLLM、模型量化、KV Cache（面试高频口头问题）
RAG 常见问题解决方案：召回不足、幻觉、长文档处理思路
✅ 简历项目 2：基于 Agent 的自动化办公助手
功能：多步骤任务规划、工具调用、知识库问答结合；提供演示视频、Github 完善 README
主线 C：实习投递（3 月立刻启动）
投递关键词（广深）
大模型应用工程师、LLM 开发工程师、AI 应用开发、RAG 开发、智能体开发
投递范围：
深圳：腾讯、华为云、深信服、各类 AI 初创、机器人企业
广州：琶洲 AI 企业、广汽研究院、政企数字化、金融科技公司
# 第四阶段：2027.07–秋招｜实习 + 面试冲刺
系统整理面试八股
Java 后端基础八股（集合、线程、Spring）
AI 应用八股：RAG 痛点、幻觉解决方案、Embedding 选型、Agent 设计、流式实现
深度打磨两个项目，预设面试官深挖问题
例如：为什么选用 PGVector？如何优化召回？RAG 有哪些缺陷？为什么选择 SpringAI？
持续复盘代码，完善 Github 仓库
# 双线每日时间分配参考（研二在校）
总时长：3～4h
## 方案 A（工作日）
1.2h：Java/SpringBoot 编码学习
1.8～2.8h：Python / LLM / RAG / Agent 实战
## 方案 B（科研忙碌压缩版，最低底线 2h）
0.8h Java 查漏补缺
1.2h AI 相关代码实践
严格执行【对抗遗忘规则】（针对你容易忘知识点）
所有练习代码上传 Github，按阶段分类；
建立备忘录：记录频繁遗忘的 API、报错、踩坑点；
每周日预留 30 分钟复盘：挑选 3 个之前练习，脱离教程重新编写；
禁止长时间看视频不敲代码，能动手绝不只观看
## 学习避坑清单
不要一头扎进深度学习理论、Transformer 源码，投入产出比极低；
不要只调用 OpenAI 接口做 Demo，必须基于 Ollama 本地开源模型，体现私有化落地能力；
不要只学 Python，坚持 Java 主线，打造广深 B 端项目青睐的 Java+AI 复合优势；
项目拒绝玩具 Demo，完善 README、部署步骤、截图，便于面试官快速看懂。
