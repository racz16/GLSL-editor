#version 460 core
#pragma optimize(off)

struct light{
	vec3 diffuse;
	vec3 specular;
	vec3 ambient;
};

#line 0
mat4 computeViewMatrix(vec3 forward, vec3 right, vec3 up);

//blokkon belülre még nem lehet semmit írni
void main(){
	int i = 0;
	while(i<100){
		computeViewMatrix(i, i+1, i+2);
		i += 1;
	}
}

mat4 computeViewMatrix(vec3 forward, vec3 right, vec3 up){
	return forward + right + up;
}

/* egyenlõre még változókat se lehet csak úgy létrehozni
   pláne nem uniformokat
uniform mat4 projectionMatrix;
uniform vec3 normal;

*/