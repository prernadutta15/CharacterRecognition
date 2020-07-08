   # PROJECT DOCUMENTATION

## CHARACTER RECOGNITION USING NEURAL NETWORKS


## PRERNA DUTTA
### UNDER THE GUIDANCE OF:
## PROFESSOR SHILADITYA MUKHERJEE
### TEAM MEMBERS:
SNEHAL PATRA
SUJAY MAYRA

## ST. XAVIER’S COLLEGE, KOLKATA
### BSc. COMPUTER SCIENCE HONOURS
### SEMESTER- V & VI

## SNAPSHOTS

### INCORRECT RECOGNITION (BEFORE TRAINING)
![image](https://user-images.githubusercontent.com/63841770/86935602-a5236880-c15a-11ea-8a97-92e94984b7d7.png)

### AFTER TRAINING
![image](https://user-images.githubusercontent.com/63841770/86935623-a81e5900-c15a-11ea-9b8a-c999a4225b09.png)

### 100% MATCH
![image](https://user-images.githubusercontent.com/63841770/86935641-ace30d00-c15a-11ea-8f36-6343c98746e2.png)

### ALPHABET RECOGNITION SAMPLE

![image](https://user-images.githubusercontent.com/63841770/86935548-963cb600-c15a-11ea-91f9-c545bf1cb1a6.png)

![image](https://user-images.githubusercontent.com/63841770/86935586-9fc61e00-c15a-11ea-9a1e-6927c1055e81.png)

# TABLE OF CONTENTS
1. ABSTRACT
2. ACKNOWLEDGEMENT
3. INTRODUCTION

	3.1 PROJECT AIM
  
	3.2 OBJECTIVES
4. SYSTEM ANALYSIS

	4.1 IDENTIFICATION OF NEED
  
	4.2 PRELIMINARY INVESTIGATION
	
  4.3 FEASIBILITY STUDY
5. BACKGROUND

	5.1 INTRODUCTION TO NEURAL NETWORKING
		
    5.1.1 HISTORY
		
    5.1.2 BIOLOGICAL INSPIRATION
		
    5.1.3 ARTIFICIAL NEURAL NETWORKS
		
    5.1.4 LEARNING PARADIGMS
		
    5.1.5 BASIC PRINCIPLES
	
  5.2 INTRODUCTION TO CHARACTER RECOGNIZATION
	
    5.2.1 HISTORY OF OCR
		
    5.2.2 CHARACTER RECOGNITION PROCESS

6. PROJECT SCHEDULING AND PLANNING

	6.1 VARIOUS S/W DEVELOPMENT METHODOLOGIES

    6.1.1 WATERFALL MODEL
		
    6.1.2 INCREMENTAL MODEL
		
    6.1.3 SPIRAL MODEL
		
    6.1.4 RAD MODEL
	
  6.2 CHOSEN METHODOLOGY
	
  6.3 GANTT CHART
	
  6.4 TIME MANAGEMENT

7.REQUIREMENT ANALYSIS

	7.1 TASKS TO BE PERFORMED
  
	7.2 FUNCTIONAL REQUIREMENTS
	
  7.3 NON-FUNCTIONAL REQUIREMENTS

8. SYSTEM DESIGN

	8.1 DESIGN PRINCIPLES AND CONSTRAINTS

  8.2 HIERARCHIAL TASK ANALYSIS
	
  8.3 SYSTEM CLASS DIAGRAM

9. IMPLEMENTATION
	
  9.1 PROGRAMMING LANGUAGE
	
  9.2 DEVELOPMENT ENVIRONMENT
	
  9.3 DATA STRUCTURES
	
  9.4 ALGORITHMS
		
    9.4.1 CHOICE OF THE ACTIVATION FUNCTION
		
    9.4.2 BUILDING THE NEURAL NETWORK
		
    9.4.3 BUILDING THE GUI

10. CODING

11. TESTING
	
  11.1 TESTING METHODOLOGIES
	
  11.2 TEST CASES AND OUTPUTS

12. EVALUATION AND CONCLUSION
	
  12.1 PROJECT EVALUATION
	
  12.2 FURTHER IMPROVEMENTS
	
  12.3 CONCLUDING REMARKS

13. REFERENCES

## 1. ABSTRACT
“We may hope that machines will eventually compete with men in all purely intellectual fields”-Alan Turing.
Machines are very different from humans in the sense that it is very easy for machines to count and calculate in a fraction of seconds while it is a daunting task for humans as it is very time-consuming. On the other hand, recognizing patterns, faces and text from images come very intuitively to humans but is very difficult for machines. This is where artificial intelligence comes in. Artificial Neural Network is a mathematic model, which is inspired from the intricate network structure of a human brain and can be trained to recognize patterns.
This paper covers the problem and implementation of character recognition using the concept of neural networking. Software for recognition of handwritten character(s) is developed throughout the project. Software engineering approaches for gathering requirements, designing the system and testing are discussed explicitly throughout the report. Final software, which successfully implemented the entire functional requirement, can be used to investigate the behavior of the neural network. The Project is successfully completed that provides a scope for immediate training, adding to the flexibility.

## 2. ACKNOWLEDGEMENT
It is a genuine pleasure to express my deep sense of gratitude to my project guide and mentor Professor Siladitya Mukherjee. His keen interest, support and above all his overwhelming attitude to help his students has been solely and mainly responsible for completing my work. His timely advice, meticulous scrutiny, valuable guidance and scientific approach has helped and inspired me to a great extent to successfully accomplish this project.
		I am also indebted to my project partners Snehal Patra and Sujay Mayra for their contributions, assistance, sincerity, unparalleled enthusiasm, encouragement and willingness to participate.
		I am extremely thankful to Professor Shalabh Agrawal, our Head of the Department for providing all the necessary technical suggestions and for helping with the formatting and designing of the project report.

## 3. INTRODUCTION
It is interesting to note that machines, that can perform 100 million floating-point calculations per second have difficulty to distinguish between different kinds of similar objects- something that comes very naturally and intuitively to humans. Why is it that a machine can’t learn from experience rather than repeating forever an explicit set of instructions generated by a human programmer? [1]
		These are only a few of the plethora of questions challenging computer designers, engineers and programmers, all of whom are striving to create more “intelligent and responsive” computers. The inability of the current generation of computer systems to interpret the world at large does not, however, indicate that these machines are inadequate. They are ideally suited to scientific and mathematical problem solving; database creation, manipulation and maintenance, electronic communication, word processing, graphics and desktop publication and; even the simple control functions that add intelligence to and simplify our household tools and appliances are handles quite efficiently by these computers.
		On the other hand, there are many applications that we would like to automate but have not automated due to the complexities associated with programming a computer to perform the tasks. To a large extent, the problems are not unsolvable; rather, they are difficult to solve using sequential computer systems. If the only tool we have is a sequential computer, then we will naturally try to cast every problem in terms of sequential algorithms. Many problems are not suited to this approach, however, causing us to spend a great deal of effort on the development of sophisticated algorithms.
		To understand the problem that a computer faces, let us take a practical example of a visual pattern recognition. Complex patterns consisting of numerous elements that, individually, reveal little of the total pattern, yet collectively represent easily recognizable (by human) objects, are typical of the kinds of patterns that have proven most difficult for computers to recognize.
Referring to figure 3.1, we see that there is enough information in this picture to enable us to perceive the orange and identify it on the basis of our judgement but it is very difficult to write a computer program that would accurately determine the outline of the orange, and even if we succeed in doing so, the shape, size and the orientation of the orange(s) is varied which the machine cannot detect due to lack of intuition. 

![image](https://user-images.githubusercontent.com/63841770/86933982-cc793600-c158-11ea-98c2-4f2d408bf841.png)
 
                    Figure 3.1: Object Identification in a series of images
An obvious question is: How can we see the oranges in the image quickly, yet a computer cannot perform this discrimination, given that the switching time of the components in modern electronic computers are more than seven orders of magnitude faster than the cells that comprise our neurobiological systems. This question is partially answered by the fact that the architecture of the human brain is significantly different from the architecture of a conventional computer. Whereas the response time of the individual neural cells is typically of the order of a few tens of milliseconds, the massive parallelism and interconnectivity observed in the biological systems evidently account for the ability of the brain to perform complex pattern recognition in a few hundred milliseconds.
		In many real-world applications, we want our computers to perform complex pattern recognition problems, such as the one just described. Since our conventional computers are obviously not suited to this type of problem, we therefore borrow features from the physiology of the brains as the basis for our new processing models. Hence, the technology has come to be known as artificial neural systems(ANS) technology, or simply neural networks.
		In figure 3.2, the different digits are written(digitally) and need to be identified by a computer. As mentioned earlier, this is challenging for a computer capable of performing routine tasks, especially because a single character(digit in this case) can be written in multiple styles and sizes, that are easily understandable by humans but not by machines. 
 
![image](https://user-images.githubusercontent.com/63841770/86934006-d438da80-c158-11ea-8cbc-a768f4e20884.png)
 
Figure 3.2: Digits to be identified by the computer
Even though a character set can be defined rigorously, people tend to personalize the manner in which they write the characters. This subtle variation in style is difficult to deal with when an algorithmic pattern-matching approach is used, because it combinatorically increases the size of the legal input space to be examined.

## 3.1 PROJECT AIM
The aim of this project is to build an artificial neural network to recognize characters of the English alphabet. The neural model is a complex system that can recognize unknown handwritten characters. The software should have user friendly graphical user interface that will allow the user to draw the character digitally with ease. The Neural network should train on the given set of samples initially and later recognize the unknown character, which can be provided by user. Figure 3.1 illustrates the process of character recognition. The input character is digitized and sent to a trained neural network; and network will classify received character. This paper will cover development life-cycle of this project including research, requirement gathering, system designing, implementation, testing and evaluation of results.

![image](https://user-images.githubusercontent.com/63841770/86934030-d864f800-c158-11ea-8a80-d19f4e257891.png)
 
Figure 3.3: Character Recognition Process


## 3.2 OBJECTIVES
The objective of the project is to build a character recognition model using artificial neural network. The project primarily includes building a GUI platform that will help users to draw characters individually with the mouse on a two dimensional matrix platform, train the system and see the output of the recognition process. This will enable the user to test the accuracy of recognition of individual characters by the system. Since this model is based on Artificial Neural Network, it is very easy to add a new style of writing a character by training it once or twice with a few variations. For example, the letter A may be written in the following ways:

![image](https://user-images.githubusercontent.com/63841770/86934043-dbf87f00-c158-11ea-8643-a1d176b29edb.png)
 
Figure 3.4: Various styles of writing A
Thus our project aims to tackle all the different styles, with the flexibility of incorporating new styles any time.

# 4. SYSTEM ANALYSIS
This portion covers the aspects that led to the selection of this topic and also throws light on the various technologies and softwares available for this purpose and how our project tries to overcome the drawbacks of most of the software that are available in the market. Also, it provides a feasibility study that had been conducted carefully to ensure that the project was feasible to conduct and complete.

## 4.1 IDENTIFICATION OF NEED
Despite the abundance of technological writing tools, many people still choose to take their notes traditionally-with pen and paper. However, there are drawbacks to handwriting text. It’s difficult to store and access physical documents in an efficient manner, search through them efficiently and to share them with others. Thus, a lot of important knowledge gets lost or does not get reviewed because of the fact that documents never get transferred to digital format. We have thus decided to tackle this problem in our project because we believe the significantly greater ease of management of digital text compared to written text will help people more effectively access, search, share, and analyze their records, while still allowing them to use their preferred writing method. The intention of this project is to characterize and distinguish individual characters keeping track of their multiple styles with the help of artificial intelligence.



## 4.2 PRELIMINARY INVESTIGATION
A variety of technologies are already available to recognize characters. However, they have drawbacks of their own- which was the sole inspiration to implement the Character Recognition problem in a way that is both integrable and easy to train.
OCR technologies:
The task of optical character recognition(OCR) may be implemented in a number of ways. 
Available software:
	Tesseract – is an open-source software but is difficult to integrate and train.
	Abbyy- is not a generic software and needs to be purchased
	Addmengroup- is again difficult to integrate and train.
These softwares are difficult to integrate and hence we have tried to implement the OCR using a neural networking algorithm that provides much more flexibility in terms of training and is much easier to integrate.
Concepts of Neural Networks:
This project required a complete study of neural networks- the working formulae and mechanisms, the learning procedures, error detection and correction, adaptation and associated algorithms.
Choice of language:
The language chosen was Java for effective event handling and file handling systems. The choice of programming language plays a paramount important role in development process of the project. Development and execution time depends on the programming language used. Also, considering object oriented approach undertaken in design process, two object-oriented programming languages were considered for development of this project; C# and Java. C# and Java have similar syntaxes and compiled using the state machine; Java Virtual Machine (JVM) and Common Language Runtime (CLR) respectively. Both programming languages have its advantages and drawbacks. Since C# was developed after Java it offers more features like supporting unsigned bits and high precision for decimal arithmetic. Microsoft .Net provides a high number of framework preferences that can be also used by C# developers. However; C# is a Microsoft technology and has a restricted license for some APIs and is limited to Microsoft operating systems. Java, on the other hand, can be executed on any operating system that has installed JVM. Compiled Java code produces bytecode that can be run on any machine. Moreover, Java Technologies is considered as an open source and has wide library and API choices. Considering portability and our prior knowledge and experience, Java was selected as a programming language for development of this project.
Choice of a suitable IDE for GUI designing:
Few of the various available softwares:
	Eclipse
	MyEclipse
	Intellij Idea
	J-Builder
	NetBeans
After programming language was chosen various development environments (as mentioned above) were considered for implementing project. Integrated Development Environment (IDE) provides integrated utilities for efficient software development. It includes compiler, debugger, code editor and code completion features. Some IDEs support Graphical User Interface (GUI) development by offering simplified GUI construction environment. Developer can sketch user interface and concentrate on design instead of writing code for GUI that can be seen only after compiling and running the program. IntelliJ Idea was preferred to as a development environment after considering both multi-language and Java IDEs. Control over source code, refactoring features, and simple interface make IntelliJ one of the best IDEs for Java. 
Lack of GUI designer is a main disadvantage of IntelliJ. However, facilities provided by Eclipse can be extended by means of various plugins. Therefore, the GUI platform was chosen to be Intellij Idea since it is user-friendly and open-source. 
Event Handling in Java: Event handling is the receipt of an event at some event handler from an event producer and subsequent processes. An event handler typically is a software routine that processes actions such as keystrokes and mouse movements. 
A complete survey of awt and swing in Java was performed. Swing is the latest GUI toolkit, and provides a richer set of interface components than the AWT and was hence preferred to create the interface.
4.3 FEASIBILITY STUDY
An extensive feasibility study is carried out to determine the viability of the idea ensuring that the project is legally and technically feasible as well as economically justifiable. The purpose of the feasibility study is to determine whether a project is worth an investment.
Five areas of project feasibility:
1) Technical feasibility- Technical feasibility study is the complete study of the project in terms of input, processes, output, fields, programs and procedures. It was found that the hardware specifications and the softwares required were easily available and are openly available and are hence feasible to use.
2) Economic feasibility- As an open-source software(IntelliJ) was used and is hence economically feasible to implement.
3) Legal feasibility-  Legal feasibility determines whether the proposed system conflicts with legal requirements. The project does not involve any controversial issues, neither does it hurt any cultural or ethical issues and is hence considered to be legally feasible.
4) Operational feasibility- Operational feasibility is the measure of how well a proposed system solves the problems. The main objective of the project being character recognition, it was noted that on completion, the project would be able to satisfy the requirements (as listed in requirement specification) and is hence deemed to be operationally feasible.
5) Scheduling feasibility- An extensive planning was carried out to ensure that the project would meet the deadlines. The various sub-tasks were identified and the work was distributed accordingly to ensure that all the deadlines are met and the targets are fulfilled.
# 5.  BACKGROUND
## 5.1 INTRODUCTION TO NEURAL NETWORKING
### 5.1.1 HISTORY 
In the 1940s, the neurophysiologist Warren McCulloch and the mathematician Walter Pits designed the first mathematical implementation of an artificial neuron combining the neuroscience foundations with mathematical operations. At that time, many studies were being carried out on understanding the human brain and how and if it could be simulated, but within the field of neuroscience. The idea of McCulloch and Pits was a real novelty because it added the math component. Further, considering that the brain is composed of billions of neurons, each one interconnected with another million, resulting in some trillions of connections, we are talking about a giant network structure. However, each neuron unit is very simple, acting as a mere processor capable to sum and propagate signals.  
 
 ![image](https://user-images.githubusercontent.com/63841770/86934067-e286f680-c158-11ea-8f71-1f3cd2aa5f4d.png)
 
		Figure 5.1: McCulloch And Pits Model
	Origins of OCR can be traced to the early 20th century. One of the first OCR machines was developed by Emanuel Goldberg in 1914 [2]. Goldberg’s machine was reading characters and transferring them into telegraph code. During that period Edmund Fournier d’Albe build a machine called Otophone, whose purpose was aiding blind people by producing tones when devices were moved over letters [3]. During the 1950s, Intelligent Machines Research Corporation (IMRC) produced the first commercially used OCR machines that were sold to Reader’s Digest, Standard Oil Company, Ohio Bell Telephone Company for reading reports and bills [4]. These OCR machines were cost-effective way to handle data entry. In the mid-1960s a new generation of OCR machines were introduced which could recognize handwritten digits and some characters [4]. As years passed character recognition rate of new OCR machines were increased. Today OCRs are widely used as their recognition rate of typewritten text is over 90%. However, the perfect rate can be obtained after human inspection and repeated training [4]. Handwriting recognition and text written in other languages are still considered subjects of research.
### 5.1.2 BIOLOGICAL INSPIRATION
Neural networks are the simplified models of the biological neurons system. The human brain computes in an entirely different way from digital computer. The brain is a highly complex, nonlinear and parallel information processing system. It has the capability to organize its structural constituents, known as neurons or nerve cells. [5]
The Human Brain:
The brain is the most significant part of the body and it has full control that enables us to do each and everything in our daily life. Human brain is one of the most complicated things and is not easy to understand. It has about 10 billion nerve cells(neurons). Each neuron connects to approximately 100-10000 other neurons through transmitting electro-chemical signals. There are over 100 different types of neurons transmitting electro-chemical signals.
	  ![image](https://user-images.githubusercontent.com/63841770/86934082-e6b31400-c158-11ea-9eed-02605aa61b6f.png)
    
			Figure 5.2: Parts of the human brain
In the human brain learning process is performed by the nervous system. The various components are:
1) Cell body/soma: The nervous systems prepare the data through neurons. Neurons have some special components to input/output and process the data. Neurons are known as cell body.
2) Nucleus: Nucleus is the data processing center.
3) Dendrites: A neuron collects signals from others through a host of fine structures that are known as dendrites. They are responsible for the data input into the soma.
4) Axon/Nerve fibers: A single axon which is a tubular extension from the cell soma that carries the data away from the soma to another neuron for processing.
Synapse is a biochemical device, which converts a pre-synaptic electrical signal into a chemical signal and then back into a post-synaptic electrical signal. Axon connects to dendrites via synapses. Synapse is the joint place of axon and dendrites.

![image](https://user-images.githubusercontent.com/63841770/86934110-ef0b4f00-c158-11ea-9339-b0e11a7ddf61.png) 
			Figure 5.3: Connection of neurons
The membrane of a neuron separates the intracellular plasma from the interstitial fluid external to the cell. The membrane is permeable to certain ionic species, and acts to maintain a potential difference between the intracellular fluid and the extracellular fluid. It accomplishes this task primarily by the action of a sodium-potassium pump. This mechanism transports sodium ions out of the cell and potassium ions into the cell. Excitatory inputs to the cell reduce the potential difference across the cell membrane. The resulting depolarization at the axon hillock alters the permeability of the cell membrane to sodium ions.
Communication between neurons occurs as a result of the release by the presynaptic membrane cause an influx of calcium ions. These ions cause the vesicles containing the neurotransmitters to fuse with the presynaptic membrane and to release their neurotransmitters into the synaptic cleft.

### 5.1.3 ARTIFICIAL NEURAL NETWORKS(ANNs)
"Artificial Neural Networks are massively parallel interconnected networks of simple (usually adaptive) elements and their hierarchical organizations which are intended to interact with the objects of the real world in the same way as biological nervous systems do." -- T. Kohonen
Artificial neural networks (ANNs) are biologically inspired computer programs designed to simulate the way in which the human brain processes information. ANNs gather their knowledge by detecting the patterns and relationships in data and learn (or are trained) through experience, not from programming. An ANN is formed from hundreds of single units, artificial neurons or processing elements (PE), connected with coefficients (weights), which constitute the neural structure and are organized in layers. The power of neural computations comes from connecting neurons in a network. Each PE has weighted inputs, transfer function and one output. The behavior of a neural network is determined by the transfer functions of its neurons, by the learning rule, and by the architecture itself. The weights are the adjustable parameters and, in that sense, a neural network is a parameterized system. The weighed sum of the inputs constitutes the activation of the neuron. The activation signal is passed through transfer function to produce a single output of the neuron. Transfer function introduces non-linearity to the network. During training, the inter-unit connections are optimized until the error in predictions is minimized and the network reaches the specified level of accuracy. Once the network is trained and tested it can be given new input information to predict the output. Many types of neural networks have been designed already and new ones are invented every week but all can be described by the transfer functions of their neurons, by the learning rule, and by the connection formula. ANN represents a promising modeling technique, especially for data sets having non-linear relationships which are frequently encountered in pharmaceutical processes. In terms of model specification, artificial neural networks require no knowledge of the data source but, since they often contain many weights that must be estimated, they require large training sets. In addition, ANNs can combine and incorporate both literature-based and experimental data to solve problems. The various applications of ANNs can be summarized into classification or pattern recognition, prediction and modeling. Supervised 'associating networks can be applied in pharmaceutical fields as an alternative to conventional response surface methodology. Unsupervised feature-extracting networks represent an alternative to principal component analysis. Non-adaptive unsupervised networks are able to reconstruct their patterns when presented with noisy samples and can be used for image recognition. The potential applications of ANN methodology in the pharmaceutical sciences range from interpretation of analytical data, drug and dosage form design through biopharmacy to clinical pharmacy.
Inspired by a biological model, McCulloch and Pitts developed the first mathematical model of a neuron in 1943.[6]. The McCulloch and Pitts theory is based on five assumptions.
1.	The activity of a neuron is an all-or-none process.
2.	A certain fixed number of synapses(>1) must be excited within a period of latent addition for a neuron to be excited.
3.	The only significant delay within the nervous system is synaptic delay.
4.	The activity of any inhibitory synapse absolutely prevents excitation of the neuron at that time.
5.	The structure of the interconnection network does not change with time.


The McCulloch-Pitts neural model is also known as linear threshold gate. It is a neuron of a set of inputs I1, I2, I3,…In   and one output y. The linear threshold gate simply classifies the set of inputs into two different classes. Thus the output y is binary. Such a function can be described mathematically using these equations:
 	
 	
W1,W2,…Wn are weight values normalized in the range of either (0,1) or (-1,1) and associated with each input line,   is the weighted sum, and   is a threshold constant. The function f is a linear step function at threshold   as shown in figure 5.4. 

The McCulloch-Pitts model of a neuron is simple yet has substantial computing potential. It also has a precise mathematical definition. However, this model is so simplistic that it only generates a binary output and also the weight and threshold values are fixed. The neural computing algorithm has diverse features for various applications [7]. Thus, we need to obtain the neural model with more flexible computational features.
Characteristics of a typical ANN:
1) Non-linearity- For higher relations and greater flexibility, ANNs are non-linear.
In fact, most real life problems happen to be non-linear in nature. Neurons are non-linear.
2) I/P O/P Mapping- The parameters of a system are adjusted to get close to the desired output. There has to be a teacher to feed the results.
3) Adaptivity- This deals with adapting to changes in the output by adjusting the “free parameter”.
4) Evidential Response- this deals with a confidence measure to make a decision.
5) Fault Tolerance- A proper ANN must have a graceful degradation but not a catastrophic damage. This means in case of a failure, it must not stop or abort abruptly but must steadily degrade or reduce performance.
6) VLSI Implementable- ANNs must be flexible enough to be implemented on a large to a very-large scale.


Biological Neural Network	Artificial Neural Network
Slower in speed.	Faster in speed.
Adaptation is possible, because new information is added without destroying old information.	Adaptation is not possible, because new information destroys the old information.
It is fault-tolerant, that is information is preserved even if there are slight faults in the system.	It has no fault-tolerance, that is memory cannot be restored back.
Memory and processing elements are collocated.	Memory and processing elements are separate.
There is self-organization during the learning.	This is software-dependent.
BNNs are parallel and synchronous.	ANNs are sequential and synchronous.

Table 5.1: Differences between Artificial Neuron Network(ANN) and Biological Neural Network(BNN)

### 5.1.4 LEARNING PARADIGMS
Learning is the most interesting feature of a neural network. Artificial neural network adopts its behavior to changing environment in order to achieve better approximation. This is achieved by modifying weights of a neural network. There are mainly three learning paradigms:
1) Supervised learning- In this process, every input pattern is associated with its output pattern. Output pattern is known as target or desired pattern. A teacher is present during the learning process. A comparison is required between the network’s computed output and the correct output to determine the error. The error can then be used to change network parameters which improves the performance.
2) Unsupervised learning- In this method, the target output is not present to the network. It is as if there is no teacher to present the desired patterns and hence the system learns on its own by discovering and adapting to structural features in the input pattern. The weight and bias are adjusted based on inputs only. Most algorithms of this type learn to cluster input patterns into a finite number of classes, example being vector quantization applications.
3) Reinforced learning- This is somewhat similar to supervised learning- but instead of being provided with the correct output value for each input, the algorithm is only provided with a given grade/score as a measure of the ANN’s performance.
5.1.5 BASIC PRINCIPLES AND TECHNIQUES
Supervised Learning Algorithms
Supervised learning is one of the well-known learning paradigms in machine learning. Neural network is trained by examples where the desired output is presented [8]. Single layered network can be sufficient for linearly separable classes, when for non-linear cases multi-layered neural network is applied. Adjustments of weights in neural network are conducted by learning algorithms. Learning algorithms are also referred to as training rules or training algorithms. This section discusses various learning algorithms that were researched during this project. 
1) Perceptron
Perceptron is a linear classifier for binary classes that uses single-layered network. This algorithm was suggested by Frank Rosenblatt in 1957 for solving linearly separable classification problems [9]. Classification of an input sample is evaluated by simple threshold logic where activation of a network compared to a threshold value. Activation of a perceptron is a produced by dot product of input (x) and weight(w) vectors of a neural network. If the activation value is greater than the threshold, then the output of a network is “1” and “0” if it is less [9]
2) Delta Rule
In 1960, Widrow and Hoff introduced new learning algorithm, delta rule, which trains network by minimizing error between activation output and expected result through gradient descent [9]. In contrast to perceptron, value of error in delta rule is not restrained to 0 or 1. For comparing behavior of delta rule and perceptron, delta
rule with linear activation function is used. Total error of training samples during an epoch is calculated by Etotal =1/2 ∑(tk - ak)2, where a is an output value generated by network given an input pattern of kth sample. In this case, output of a network is the sum of weighted inputs. Having an influence on result of a network, weights affect total error.
The goal of a delta rule is to achieve weights where error E is minimal. For any value of weights, updates are done to move error value down the curve till minimum reached. Delta rule constantly adjusts weights until total error of training epoch is less than specified target error. Target error to be achieved depends on developer’s preference. Delta rule can also be used to approximate nonlinearly separable classes. However, success rate of delta rule in non-linearly separable classes is arguable. In this case, activation function is not a linear but continues function. 
3) Backpropagation
Previous sections introduced concepts of training of neural network with a single layer. Single layered network is limited to classify only two different classes. For classifying multiple distinct classes, multilayered neural network is applied. Multilayered network with a feed forward architecture was used in the development of character recognition software. Feedforward multilayered network is a fully inter-connected network where nodes of each layer is connected to every node of next layer [9]. As name suggests, information in feedforward multilayered networks flows from left to right. Backpropagation is a supervised learning algorithm used for training feedforward multilayered network. Approach of backpropagation algorithm is similar to delta rule as it based on minimizing error by gradient descent. Nodes of both output and hidden layer have non-linear activation function that is applied on inputs passed from previous layer [9]. Measure of error in classification is affected by weights leading to hidden and output layer. Therefore, appropriate blame must be assigned for those weights. Errors in results, which are presented by output layer, are propagated backward to inner layers in order to make adjustments to weights.

## 5.2 INTRODUCTION TO CHARACTER RECOGNITION
Optical Character Recognition (OCR) is a process of converting scanned image of handwritten characters into machine readable text [10]. OCR is considered a subfield of pattern recognition where system assigns input to one of the given classes. Numbers, characters and notations are presented to an OCR machine which classifies unknown input by comparing it to introduced examples. This next section considers the OCR process and its history.
### 5.2.1 History of Optical Character Recognition
Origins of OCR can be traced to the early 20th century. One of the first OCR machines was developed by Emanuel Goldberg in 1914 [2]. Goldberg’s machine was reading characters and transferring them into telegraph code. During that period Edmund Fournier d’Albe build a machine called Otophone, whose purpose was aiding blind people by producing tones when devices were moved over letters [3]. During the 1950s, Intelligent Machines Research Corporation (IMRC) produced the first commercially used OCR machines that were sold to Reader’s Digest, Standard Oil Company, Ohio Bell Telephone Company for reading reports and bills [4]. These OCR machines were cost-effective way to handle data entry. In the mid- 1960s a new generation of OCR machines were introduced which could recognize handwritten digits and some characters [4]. As years passed character recognition rate of new OCR machines were increased. Today OCRs are widely used as their recognition rate of typewritten text is over 90%. However, the perfect rate can be obtained after human inspection [4]. Handwriting recognition and text written in other languages are still considered subjects of research.


### 5.2.2 Character Recognition Process
Character Recognition process can be broken down into 3 main stages; Pre-processing, Feature Extraction and Artificial Neural Network (ANN) modeling. Pre-processing is considered as a first phase of character recognition process and to increase chance of recognition, the image is improved. Noise, tilted image, distortion and other factors that can affect recognition rate can be removed by pre-processing. The following pre-processing methods are commonly used in character recognition software [11]:
i. Binarisation - Image is converted into binary (black-and-white) scale for decreasing computational power of learning algorithm. Threshold pixel value is chosen. Pixels below that value assumed as white regions when higher pixels assigned to be black.
ii. Thinning - Using edge detection algorithm, character’s width is thinned to 1  pixel. This helps to make characters uniform and reduce redundancy.
iii. Normalization - Position, aptitude and size of a character is normalized according to chosen template.
Later, pre-processed image is transformed into dimensionally reduced representation. Simplifying large data decreases computation time of recognition process. Reduced representation is called “features”, and process of choosing feature referred to as “feature extraction” [11]. Finally, extracted features are passed to artificial neural network where training and simulation happens. 

# 6 PROJECT SCHEDULING AND PLANNING
## 6.1 VARIOUS SOFTWARE DEVELOPMENT METHODOLOGIES
Software development methodology is a software engineering approach for planning, designing, implementation and maintaining large-scaled software [12]. Rules and phases specified by chosen methodology are followed in order to efficiently develop and deliver the final product. There are two main types of methodologies: sequential and cyclical. Sequential methodology suggests approaching software development phases in sequence. Firstly, planning phase completed, then the designing phase proceeded by implementation phase and finalized by testing phase. The Waterfall model is an example of sequential methodology. However, cyclical methodology proposes iterating over phases. Small proportion of planning, designing, implementation and testing process evaluated for each iteration until final product is ready. Spiral model is considered a cyclic methodology [13]. Performance of methodology differs depending on various aspects like deliverables, tools, environment and etc. Several methodologies, analysis of which is given in the next section, were considered for development of this project.
### 6.1.1 The waterfall model
The first published model of the software development process was derived from
more general system engineering processes (Royce, 1970). This model is illustrated
in Figure 6.1. Because of the cascade from one phase to another, this model is known
as the ‘waterfall model’ or software life cycle. The waterfall model is an example of
a plan-driven process—in principle, one must plan and schedule all of the process
activities before starting work on them. [14]

 ![image](https://user-images.githubusercontent.com/63841770/86934118-f2063f80-c158-11ea-868c-59d5e8b4a040.png)
 
			Figure 6.1: Stages of the Waterfall Model
The principal stages of the waterfall model directly reflect the fundamental development activities:
1. Requirements analysis and definition The system’s services, constraints, and
goals are established by consultation with system users. They are then defined in detail and serve as a system specification.
2. System and software design The systems design process allocates the requirements to either hardware or software systems by establishing an overall system architecture. Software design involves identifying and describing the fundamental software system abstractions and their relationships.
3. Implementation and unit testing During this stage, the software design is realized as a set of programs or program units. Unit testing involves verifying that each unit meets its specification.
4. Integration and system testing The individual program units or programs
are integrated and tested as a complete system to ensure that the software requirements have been met. After testing, the software system is delivered to the customer.
5. Operation and maintenance Normally (although not necessarily), this is the
longest life cycle phase. The system is installed and put into practical use. Maintenance involves correcting errors which were not discovered in earlier stages of the life cycle, improving the implementation of system units and enhancing the system’s services as new requirements are discovered.
In principle, the following phase should not start until the previous phase has finished. However, in practice, these stages overlap and feed information to each other. During design, problems with requirements are identified. During coding, design problems are found and so on. The software process is not a simple linear model but involves feedback from one phase to another. Documents produced in each phase may then have to be modified to reflect the changes made.
Because of the costs of producing and approving documents, iterations can be costly and involve significant rework. Therefore, after a small number of iterations, it is normal to freeze parts of the development, such as the specification, and to continue
with the later development stages. Problems are left for later resolution, ignored, or programmed around. This premature freezing of requirements may mean that the system won’t do what the user wants. It may also lead to badly structured systems as design problems are circumvented by implementation tricks. During the final life cycle phase (operation and maintenance) the software is put into use. Errors and omissions in the original software requirements are discovered. Program and design errors emerge and the need for new functionality is identified. The system must therefore evolve to remain useful. Making these changes (software maintenance) may involve repeating previous process stages.
The waterfall model is consistent with other engineering process models and documentation is produced at each phase. This makes the process visible so managers can monitor progress against the development plan. Its major problem is the inflexible partitioning of the project into distinct stages. Commitments must be made at an early stage in the process, which makes it difficult to respond to changing customer requirements.
In principle, the waterfall model should only be used when the requirements are well understood and unlikely to change radically during system development. However, the waterfall model reflects the type of process used in other engineering projects. 

### 6.1.2 Incremental development
Incremental development is based on the idea of developing an initial implementation, exposing this to user comment and evolving it through several versions until an adequate system has been developed (Figure 2.2). Specification, development, and validation activities are interleaved rather than separate, with rapid feedback across activities. Incremental software development, which is a fundamental part of agile approaches, is better than a waterfall approach for most business, e-commerce, and personal systems. Incremental development reflects the way that we solve problems.
We rarely work out a complete problem solution in advance but move toward a solution in a series of steps, backtracking when we realize that we have made a mistake. By developing the software incrementally, it is cheaper and easier to make changes in the software as it is being developed. Each increment or version of the system incorporates some of the functionality that is needed by the customer. Generally, the early increments of the system include the most important or most urgently required functionality. This means that the customer can evaluate the system at a relatively early stage in the development to see if it delivers what is required. If not, then only the current increment has to be changed and, possibly, new functionality defined for later increments. Incremental development has three important benefits, compared to the waterfall model:
1. The cost of accommodating changing customer requirements is reduced. The
amount of analysis and documentation that has to be redone is much less than is
required with the waterfall model.
2. It is easier to get customer feedback on the development work that has been
done. Customers can comment on demonstrations of the software and see how
much has been implemented. Customers find it difficult to judge progress from
software design documents.
3. More rapid delivery and deployment of useful software to the customer is possible, even if all of the functionality has not been included. Customers are able to use and gain value from the software earlier than is possible with a waterfall process.
Incremental development in some form is now the most common approach for the development of application systems. This approach can be either plan-driven, agile, or, more usually, a mixture of these approaches. In a plan-driven approach, the system increments are identified in advance; if an agile approach is adopted, the early increments are identified but the development of later increments depends on progress and customer priorities.
From a management perspective, the incremental approach has two problems:
1. The process is not visible. Managers need regular deliverables to measure progress. If systems are developed quickly, it is not cost-effective to produce documents that reflect every version of the system.
2. System structure tends to degrade as new increments are added. Unless time and money is spent on refactoring to improve the software, regular change tends to corrupt its structure. Incorporating further software changes becomes increasingly difficult and costly.

### 6.1.3 Spiral Model:
The spiral model is similar to the incremental model, with more emphasis placed on risk analysis. The spiral model has four phases: Planning, Risk Analysis, Engineering and Evaluation. A software project repeatedly passes through these phases in iterations (called Spirals in this model). The baseline spiral, starting in the planning phase, requirements are gathered and risk is assessed. Each subsequent spirals builds on the baseline spiral.
Planning Phase: Requirements are gathered during the planning phase. Requirements like ‘BRS’ that is ‘Bussiness Requirement Specifications’ and ‘SRS’ that is ‘System Requirement specifications’.
Risk Analysis: In the risk analysis phase, a process is undertaken to identify risk and alternate solutions.  A prototype is produced at the end of the risk analysis phase. If any risk is found during the risk analysis, then alternate solutions are suggested and implemented. [15]
Engineering Phase: In this phase software is developed, along with testing at the end of the phase. Hence in this phase the development and testing is done.
Evaluation phase: This phase allows the customer to evaluate the output of the project to date before the project continues to the next spiral.

### 6.1.4 RAD Model:
RAD model is Rapid Application Development model. It is a type of incremental model. In RAD model the components or functions are developed in parallel as if they were mini projects. The developments are time boxed, delivered and then assembled into a working prototype.  This can quickly give the customer something to see and use and to provide feedback regarding the delivery and their requirements.
The phases in the rapid application development (RAD) model are:
Business modeling: The information flow is identified between various business functions.
Data modeling: Information gathered from business modeling is used to define data objects that are needed for the business.
Process modeling: Data objects defined in data modeling are converted to achieve the business information flow to achieve some specific business objective. Description are identified and created for CRUD of data objects.
Application generation: Automated tools are used to convert process models into code and the actual system.
Testing and turnover: Test new components and all the interfaces.

Advantages of the RAD model:
	Reduced development time.
	Increases reusability of components
	Quick initial reviews occur
	Encourages customer feedback
	Integration from very beginning solves a lot of integration issues.
Disadvantages of RAD model:
	Depends on strong team and individual performances for identifying business requirements.
	Only system that can be modularized can be built using RAD
	Requires highly skilled developers/designers.
	High dependency on modeling skills
	Inapplicable to cheaper projects as cost of modeling and automated code generation is very high.

### 6.2 CHOSEN METHODOLOGY
Due to the incremental behavior and flexibility of the RAD methodology, its practices were utilised for development process of this project. Numbers of iterations were identified, and at the end of each iteration, the working code was produced.  

### 6.3 GANTT CHART
The Gantt chart drawn below shows the planned vs the actual time taken for each task:
 
 
![image](https://user-images.githubusercontent.com/63841770/86935122-1b739b00-c15a-11ea-8292-69f66c2c6d57.png)
	Figure 6.5: Gantt chart showing planned vs actual time
6.4 TIME MANAGEMENT
The project was started on 17th November 2017(this included the time required to choose the topic and the time required to familiarize with the available technologies). As mentioned above, the RAD methodology was adopted in order to meet the deadlines. The bar chart below gives a rough idea of the percentage of total work done on a monthly basis:
 
 ![image](https://user-images.githubusercontent.com/63841770/86935179-2a5a4d80-c15a-11ea-92a3-405ae9de0ce6.png)
 
	Figure 6.6: Bar chart to show percentage of work done on a monthly basis
15th February onwards, the neural network was trained and the lower case letters were implemented. Each of the alphabets had to be trained a number of times, each time with a slightly different style.

# 7 REQUIREMENT ANALYSIS
The requirements documentation describes how a software should function [16]. Therefore, establishing and managing requirements is essential in software development. Requirements engineering process encapsulates everything concerning requirements which is mainly gathering, documenting and managing requirement [17].
Requirement engineering consists of four phases: elicitation, negotiation, specification and validation. In elicitation phase, stakeholders who will interact with a system are discovered and approached in order to clarify requirements. Clarified requirements are documented in details using diagrams and tables which will assist development process. Validating requirements is quite important as user satisfaction is a priority in project development [18]. However, RAD suggests that change of requirement is inevitable during projects. Most of documentation is useless since requirements documented are no longer implemented or changed. Extreme programming recommends writing down user stories and clarifying each of them just before implementing it [19]. Main principles of RAD methodology are applied in this project and only relevant documentation of requirements are done.

## 7.1 TASKS TO BE PERFORMED
The various tasks or activities that had been identified were as follows:
a)	Create a neural network by manually specifying parameters.
b)	Initialise the neural network
c)	Set the target(or desired) outputs
d)	Create the GUI
e)	Include proper event handling to take and process input
f)	Show the target output corresponding to the character
g)	Train if character is not recognized

## 7.2 FUNCTIONAL REQUIREMENTS
The functional requirements for a system describe what the system should do. These requirements depend on the type of software being developed, the expected users of the software, and the general approach taken by the organization when writing requirements. When expressed as user requirements, functional requirements are usually described in an abstract way that can be understood by system users. However, more specific functional system requirements describe the system functions, its inputs and outputs, exceptions, etc., in detail. Functional system requirements vary from general requirements covering what the system should do to very specific requirements reflecting local ways of working or an organization’s existing systems.
Imprecision in the requirements specification is the cause of many software engineering problems. It is natural for a system developer to interpret an ambiguous requirement in a way that simplifies its implementation. Often, however, this is not what the customer wants. New requirements have to be established and changes made to the system. Of course, this delays system delivery and increases costs.
In principle, the functional requirements specification of a system should be both complete and consistent. Completeness means that all services required by the user should be defined. Consistency means that requirements should not have contradictory definitions. In practice, for large, complex systems, it is practically impossible to achieve requirements consistency and completeness. One reason for this is that it is easy to make mistakes and omissions when writing specifications for complex systems.[18]


ID	DESCRIPTION	RISK	PRIORITY
1	Construct the neural network by manually specifying the parameters 	HIGH	5
2	Set the target outputs	LOW	1
3	Initialise the neural network	LOW	2
4	Create the GUI Interface	MEDIUM	3
5	Capture user input by event handling	HIGH	4
6	Train the network	MEDIUM	3

Table 7.1: Functional Requirements

## 7.3 NON-FUNCTIONAL REQUIREMENTS
Non-functional requirements, as the name suggests, are requirements that are not directly concerned with the specific services delivered by the system to its users. They may relate to emergent system properties such as reliability, response time, and store occupancy. Alternatively, they may define constraints on the system implementation such as the capabilities of I/O devices or the data representations used in interfaces with other systems. Non-functional requirements, such as performance, security, or availability, usually specify or constrain characteristics of the system as a whole. Non-functional requirements are often more critical than individual functional requirements. System users can usually find ways to work around a system function that doesn’t really meet their needs. However, failing to meet a non-functional requirement can mean that the whole system is unusable. For example, if an aircraft system does not meet its reliability requirements, it will not be certified as safe for operation; if an embedded control system fails to meet its performance requirements, the control functions will not operate correctly. 
Although it is often possible to identify which system components implement specific functional requirements (e.g., there may be formatting components that implement reporting requirements), it is more difficult to relate components to non-functional requirements. The implementation of these requirements may be diffused throughout the system.

ID	DESCRIPTION	RISK	PRIORITY
1	GUI should be easy to use	MEDIUM	3
2	The system should work on LINUX, Windows and MacOS.	LOW	1
3	The system should be easily integrable.	MEDIUM	3
4	The system should be scalable.	LOW	2

Table 7.2: Non-functional requirements
These requirements, both functional and non-functional were listed at the beginning of the project by intuition and analysis of the proposed system. All these requirements were met by the final software.

# 8. SYSTEM DESIGN
This chapter describes the design process utilized for this character recognition project. In order to highlight the theory applied, the chapter is supported by   various conceptual diagrams. Architectural design of this project has been illustrated at various abstraction levels through this chapter.
The software design phase is an iterative process that is applied after analysing gathered requirements in order to translate requirements into a structured plan for software construction [21]. Also quality of the software can be assessed before and during construction, thus revealing flaws of a system in early stages of development. Suggested guidelines and technical criteria are followed throughout the design process in order to achieve high design quality [22].

## 8.1 DESIGN PRINCIPLES AND CONSTRAINTS
Design principles guide a software engineer to construct high quality system design. Following principles applied during design phase of this project:
i. The design should be easily altered in order to respond to changes.
ii. Integrity and uniformity is crucial in good design.
iii. Design should be in higher abstraction level that coding logic.
Applied principles increase quality of a software design from both external and internal perspective. Software properties like reliability, speed and usability that monitored by users are considered external quality factors. Internal quality factors considered by software engineers and discovered through following basic design concepts [22]:
i. Modularity - Complex problems are easier solved by divide and conquer method which is splitting problem into smaller ones. Modularity concept suggests dividing system into small modules which helps to manage system. However, large number of modules leads to more effort spent on integrating modules.
ii. Information Hiding - Information within each module should be public only for modules that actually need that information. Information hiding concept is very useful when it comes to later amendments needed in the project. Thus errors occurred in a class will not affect others.
iii. Abstraction - Modular solution to problems involve designing software at various levels of abstraction. Continuous revisions and refinements of high-level design which encapsulates overview of functionalities lead to design describing low-level details and algorithms to be considered [23]. Further chapters outline design components used for character recognition project by showing transition from high-level to lower level of abstraction.

# 9. IMPLEMENTATION
## 9.1 PROGRAMMING LANGUAGE
The various tasks to be performed that needed the correct choice were as follows:
TASK	DESCRIPTION	PLACE OF USAGE	MOST SUITABLE LANGUAGE
File Handling	This includes reading, writing and saving text files through suitable code snippets.	Used to store and append the new pixel values received while training a new style.	Java, C, C++
Storing huge data sets with undefined size	Clearly, arrays cannot be used because arrays have a predefined size. Hence alternate data structures like arraylists had to be used.	The pixel values, the weight values and the initial inputs are huge and the size cannot be predetermined. Hence linked lists or arraylists have to be used.	C#, Java
Creating a GUI Interface	The interface must be user-friendly and responsive.	This is where the system would interact with the user.	Java, C#, MATLAB
Event Handling	The various mouse-click events need to be caught and handled.	The user would input the character by left-clicking and hence marking a pixel. A right-click on the other hand, deletes or unmarks a pixel.	Java, C#, Python

		Table 9.1: Tasks that need programming considerations
Considering the requirements, and the previous familiarity, Java was chosen as the most suitable language due to availability of suitable and interactive IDEs, efficient event handling and data structures.

## 9.2 DEVELOPMENT ENVIRONMENT
Intellij Idea was chosen to be the most suitable IDE because of the following salient features:
	Easy debugging
	Auto-complete
	Easy refactoring
	Gives relevant hints and suggestions
9.3 DATA STUCTURES
Arrays being the most popular data structures may not be always useful due to the following drawbacks:
	Arrays are of fixed length. One cannot change the size of the arrays once they are created.
	One cannot accommodate an extra element in an array after they are created.
	Memory is allocated to an array during it’s creation only, much before the actual elements are added to it.
According to our requirements, the data structure to be used must not only have a huge storage capacity but also must be of variable length. This flexibility is possible in arraylists and linked lists.
Though insertion is more complex in arraylists, but our code mainly concerns with appending new elements at the end of the data structures and hence arraylists are preferred due to its simplicity and ease to implement over linked lists. The table given in the next page shows a comparative study of both the data structures in detail:  
 
Table 9.2: Complexity analysis of arraylists and linked lists
The various data structures used in the different classes are as follows:
Class name: Neuron
Data Structures:
realInputs: An integer arraylist for storing the input values
0	0	1	1	1	0	0	0	…	0

weights: A double arraylist for storing the weights
0.23	0.4	0.55	0.66	0.43	0.22	0	0.11	…	0.78

Class name: ExpectedOutputs
Data Structures:
expectedValues: double 2D arraylist
0.23	0.4	0.55	0.66	0.43	0.22	0	0.11	…	0.78
0.44	0.9	0.33	0.24	0.12	0.45	0.31	0.24	…	0.22
…									
1.0	0.56	0.66	0.34	0.22	0.56	0.34	0.21	…	0.78

Class name: TrainedValues
Data Structures:
inputs: An integer arraylist for storing the trained values
0	0	1	1	1	0	0	0	…	0

expectedValues: A double arraylist for storing the weights after training
0.13	0.41	0.25	0.66	0.93	0.42	0.1	0.11	…	0.78

Class name: ExpectedOutputs
Data Structures:
expectedValues: A 2D double arraylist for storing the desired or target pixels
0	0	0	0	0	0	0	0	…	0
1	1	0	0	1	1	1	0	…	0
0	1	1	1	1	0	1	0	…	0
…									
…									
…									
…									
1	1	1	0	0	1	0	1	…	0

These were the basic data structures that were used for the implementation of the neural model.

# 9.4 ALGORITHMS
## 9.4.1 CHOICE OF THE ACTIVATION FUNCTION
Activation functions are an extremely important feature of the artificial neural networks. They basically decide whether a neuron should be activated or not. Whether the information that the neuron is receiving is relevant for the given information or should it be ignored.[25]
 
The activation function is the non-linear transformation that we do over the input signal. This transformed output is then sent to the next layer of neurons as input. When we do not have the activation function the weights and bias would simply do a linear transformation. A linear equation is simple to solve but is limited in its capacity to solve complex problems. A neural network without an activation function is essentially just a linear regression model. The activation function does the non-linear transformation to the input making it capable to learn and perform more complex tasks. 
Popular types of activation functions:
Binary Step Function
The binary function is extremely simple. It can be used while creating a binary classifier. When we simply need to say yes or no for a single class, step function would be the best choice, as it would either activate the neuron or leave it to zero. The function is more theoretical than practical since in most cases we would be classifying the data into multiple classes than just a single class. The step function would not be able to do that.[25]
It is defined as –
f(x) = 1, x>=0
= 0,     x<0


Linear Function
Instead of a simple step function, we can try using a linear function. We can define the function as-
f(x)=ax
Here the activation is proportional to the input. The input x, will be transformed to ax. This can be applied to various neurons and multiple neurons can be activated at the same time.

The linear function might be ideal for simple tasks where interpretability is highly desired but is not suited for complicated situations.
Sigmoid
Sigmoid is a widely used activation function. It is of the form-
f(x)=1/(1+e^-x)
This is a smooth function and is continuously differentiable. The biggest advantage that it has over step and linear function is that it is non-linear. The function ranges from 0-1 having an S shape. The gradient is very high between the values of -3 and 3 but gets much flatter in other regions. This means that in this range small changes in x would also bring about large changes in the value of Y. So the function essentially tries to push the Y values towards the extremes. This is a very desirable quality when we’re trying to classify the values to a particular class.
Let’s plot this function and take a look of it.
 
Sigmoids are widely used even today but we still have a problem that we need to address. As we saw previously – the function is pretty flat beyond the +3 and -3 region. This means that once the function falls in that region the gradients become very small. This means that the gradient is approaching to zero and the network is not really learning.
Another problem that the sigmoid function suffers is that the values only range from 0 to 1. This means that the sigmoid function is not symmetric around the origin and the values received are all positive. So not all times would we desire the values going to the next neuron to be all of the same sign. This can be addressed by scaling the sigmoid function. 
Tanh
The tanh function is very similar to the sigmoid function. It is actually just a scaled version of the sigmoid function:
tanh(x)=2/(1+e^(-2x)) -1
Tanh works similar to the sigmoid function but is symmetric over the origin. it ranges from -1 to 1.
 
It basically solves the problem of the values all being of the same sign. All other properties are the same as that of the sigmoid function. It is continuous and differentiable at all points. The function as you can see is non-linear so we can easily back propagate the errors.

Choice of the suitable function:
Sigmoidal and tanh functions are interchangeably used but sigmoidal is more suited for detection and recognization purposes whereas tanh is more often used for classification problems. Hence, sigmoidal function was chosen as the activation function. 


# 10. CODING
Building the neural model required the creation of several classes and three packages containing the classes. The structure of the packages and the classes in them are as follows (the package name is in bold and the classes are specified using bullets):
alphabet
o	A.txt
o	B.txt
o	C.txt
o	D.txt
o	E.txt
o	F.txt
o	G.txt
o	H.txt
o	I.txt
o	J.txt
o	K.txt
o	L.txt
o	M.txt
o	N.txt
o	O.txt
o	P.txt
o	Q.txt
o	R.txt
o	S.txt
o	T.txt
o	U.txt
o	V.txt
o	W.txt
o	X.txt
o	Y.txt
o	Z.txt
gui_design
o	Cell
o	LeftTable
o	RightTable
o	MainGui
neural_network_design
o	ExpectedOutputs
o	ExpectedPixels
o	FileHandling
o	Neuron
o	TrainedValues
o	TrainingLetters
The contents of the alphabet package consists of a list of text files that consist of a stream of data pixels as trained by the user. The data set of B has been shown in the previous section and the text files corresponding to other alphabets are not shown in detail.
In the next page, the codes of the individual classes are given.


Cell.java:
package gui_design;

public class Cell {
    /**This class forms the backbone of the matrix used for drawing/displaying/identifying characters.
     * Each cell of the matrix is individually defined by the following attributes:
     * a)height of the cell
     * b)width of the cell
     * c)an indicator to indicate whether a cell is marked or not
     * d)the x-coordinate
     * e)the y-coordinate
     * [note: A cell can either be marked or unmarked,any third category is not possible]
     */
    /*code starts here*/
    private int x;//x-coordinate
    private int y;//y-coordinate
    private int width;
    private int height;
    private boolean flag;//for indicating marked/unmarked cell

    public Cell(int x, int y, int w, int h) {
        //constructor
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.flag = false;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean active) {
        flag = active;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

# 11 TESTING
Testing is intended to show that a program does what it is intended to do and to discover program defects before it is put into use. When one tests a software, the program is executed using artificial data. We check the results of the test run for errors, anomalies, or information about the program’s non-functional attributes. Testing is an important phase in order to present a robust product. Start of a testing phase depends on chosen software development model. For waterfall model testing starts when development phase is finished. However, in RAD methodology, which was chosen as a development model for this project, testing is done after each module at regular intervals. Therefore, faults in a system are exposed in early stages of the development and can be eliminating without additional cost.
As Edsger Dijkstra, an early contributor to the development of software engineering, eloquently stated (Dijkstra et al., 1972):
Testing can only show the presence of errors, not their absence.

![image](https://user-images.githubusercontent.com/63841770/86935451-79a07e00-c15a-11ea-853a-44f43c466a40.png)
 
			Figure 11.1: The process of testing 
      
## 11.1 TESTING METHODOLOGIES
Development Testing: Development testing includes all testing activities that are carried out by the team developing the system. The tester of the software is usually the programmer(s) who developed that software. They are of two types:
	Unit Testing is a level of software testing where individual units/ components of a software are tested. The purpose is to validate that each unit of the software performs as designed. A unit is the smallest testable part of any software. It usually has one or a few inputs and usually a single output. 
It has a number of advantages:
•	Unit testing increases confidence in changing/ maintaining code. If good unit tests are written and if they are run every time any code is changed, we will be able to promptly catch any defects introduced due to the change. 
•	Codes are more reusable. In order to make unit testing possible, codes need to be modular. This means that codes are easier to reuse.
•	Development is faster. The effort required to find and fix defects found during unit testing is very less in comparison to the effort required to fix defects found during system testing or acceptance testing.
•	The cost of fixing a defect detected during unit testing is lesser in comparison to that of defects detected at higher levels. 
•	Debugging is easy. When a test fails, only the latest changes need to be debugged. 
•	Codes are more reliable. 
Use of unit testing in the project:
The classes were individually tested each time by compiling (and hence checking for syntax errors) and the values of the variables were printed to the console at the end of every loop to inspect and invigilate it’s working. The interrelated classes, however, could not be subjected to unit testing due to the links ensuring that one class cannot be run without the other.

	System Testing:  it is a level of software testing where a complete and integrated software is tested. The purpose of this test is to evaluate the system’s compliance with the specified requirements. This was performed at the end of the project considering various test cases.
Apart from this, there is a different way of classifying test cases:
1) Black Box Testing: Black box testing is a testing technique used to test the functionality of a system without knowing its interior structure. Black box testing, also known as Behavioral Testing, is a software testing method in which the internal structure/design/implementation of the item being tested is not known to the tester. These tests can be functional or non-functional, though usually functional. The system is checked for inconsistent behavior throughout simulation with various parameters. This method can also be referred to as “hacking” or “exhaustive input testing” [24]. Black box testing can also be performed by users who do not have any programming experience, since code is not accessed.
Graphical user interface (GUI) of character recognition system was tested by black box testing method. Each input condition was simulated in order to see whether GUI responds correctly. System testing is an example of black box testing.
2) White Box Testing: Also known as Clear Box Testing, Open Box Testing, Glass Box Testing, Transparent Box Testing, Code-Based Testing or Structural Testing, this is a software testing method in which the internal structure or design or implementation of the item being tested is known to the tester. The tester chooses inputs to exercise paths through the code and determines the appropriate outputs. Programming know-how and the implementation knowledge is essential. White box testing is testing beyond the user interface and into the nitty-gritty of a system. The source code is inspected in order to find vulnerable pieces of code. As the code evolves, late discovery of small bugs in a code fragment can lead to spending more time on finding an error [14]. White box testing was used throughout project for testing of different modules.
11.2 TEST CASES AND OUTPUTS
In order to test the proper working of the code, a number of test cases were tried for each alphabet. Given below are few such cases (the user input is on the left side and the right side shows the alphabet as identified by the network):
 
Figure 11.2: Identification of G
 
Figure 11.3: Identification of C
Now, if the neural model cannot identify an alphabet correctly (which means it would need more training), the user may select the appropriate character from the drop-down menu and can click on the train button to reconfigure the weights and on restarting the system, the alphabet is identified correctly as shown below:
 
		Figure 11.4: Incorrect Identification of A
 
	Figure 11.5: Correct Identification of A (after selection of A from drop-down)

 
This is a case of an exact match, where user enters the exact pixels as the expected output. This case needs no training and no reconfiguration of internal weights.
 
		Figure 11.6: Exact identification of P

# 13. REFERENCES
[1] Smola, A., Vishwanathan, S.V.N (2008). Introduction to Machine Learning. Cambridge: Cambridge University Press.
[2] Buckland, M (2006). Emanuel Goldberg and His Knowledge Machine. USA: Libraries Unlimited
[3] Fournier d'Albe, E. E. (1914). On a Type-Reading Optophone. p373-375.

[4] Eikvil, L (1993). OCR Optical Character Recognition.  Norsk Regnesentral, P.B. p5-33.
[5] Shankar, T.N (2009). Neural Networks. University Science Press.
[6] Chakraborty R.C(2010), "Fundamentals of Neural Network", Department of Computer Science & Engineering, Jaypee University of Engineering and Technology, [Accessed: March 28, 2018], Available at:
http://www.myreaders.info/08_Neural_Networks.pdf
[7] Wagner, Tom and Towsley, Don.  ``Getting Started with POSIX Threads''. 
Department of Computer Science, University of Massachusetts at Amherst, July 1995.
[8] A. Krenker, J. Bester and A. Kos, 'Introduction to the artificial neural networks', Artificial neural networks:methodological advances and biomedical applications. InTech, Rijeka, 2011.
[9] K. Gurney, An Introduction to Neural Networks, CRC Press, 1997.
[10] Freedman, M.D. (1974). Advanced technology: Optical character recognition. Systems and their performance are compared. Spectrum, IEEE . p 44 -52.
[11] Kalaichelvi, V., Ali, A.S. (2012). Application of Neural Networks in Character Recognition. International Journal of Computer Applications.
[12] C. V. Ramamoorthy, Evolution and Evaluation of Software Quality Models, Proceedings. 14th International Conference on Tools with Artificial Intelligence (ICTAI ’02), 2002.
[13] Burback, R. (1998). Software engineering methodology. 1st ed.

[14] Sommerville Ian. Software Engineering, 7th ed. (2006).

[15] [Accessed: March 27, 2018]
 http://istqbexamcertification.com/what-is-spiral-model-advantages-disadvantages-and-when-to-use-it/
[16] Macaulay, L. (1996). Requirements engineering. 1st ed. London: Springer.

[17] Aybüke A. and Claes W. (2005) Engineering and Managing Software Requirements

[18] Sommerville Ian. Software Engineering, 9th ed. (2009).

[19] Frank Maurer and Don Wells. Extreme Programming and Agile Methods – XP/Agile Universe 2003 (2003)

[20] 

[21] Craig Larman. Applying UML and Patterns. Prentice Hall, 2004.

[22] Centre for Information Technology and Engineering, Manonmaniam Sundaranar University. Software Engineering concepts and implementation.
[23] Alpaydın, E (2010). Introduction to Machine Learning. 2nd ed. Cambridge, MaMassachusetts: The MIT
[24] Myers, G., Sandler, C. and Badgett, T. (2012). The art of software testing. 2nd ed. Hoboken, N.J.: John Wiley & Sons.
[25] [Accessed: March 27, 2018] 
https://www.analyticsvidhya.com/blog/2017/10/fundamentals-deep-learning-activation-functions-when-to-use-them/









 

