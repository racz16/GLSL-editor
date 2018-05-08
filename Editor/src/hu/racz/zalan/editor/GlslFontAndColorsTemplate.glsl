#version 420 core

layout (location = 0) in vec3 position;
layout (location = 1) in vec2 textureCoordinates;
layout (location = 2) in vec3 normal;

out vec3 normalF;
out vec3 fragmentPositionF;
out vec2 textureCoordinatesF;
out vec3 viewPositionF;

layout (std140, binding = 2) uniform Matrices {
    mat4 viewMatrix;                                //0
    mat4 projectionMatrix;                          //64
};                                                  //128

uniform vec3 viewPosition;
uniform mat4 modelMatrix;
uniform mat3 inverseModelMatrix3x3;

void main(){
    gl_Position = projectionMatrix * viewMatrix * modelMatrix * vec4(position, 1.0f);
    fragmentPositionF = vec3(modelMatrix * vec4(position, 1.0f));
    normalF = normalize(normal * inverseModelMatrix3x3);
    textureCoordinatesF = textureCoordinates;
    viewPositionF = viewPosition;
}